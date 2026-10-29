# This Dockerfile is used in order to build a container that runs the Quarkus application in JVM mode
#
# Build the image with:
#
# docker build -f Dockerfile -t balentziarra/ae-personas-jvm .
#
# Then run the container using:
#
# docker run -i --rm -p 8085:8085 balentziarra/ae-personas-jvm
#
# If you want to include the debug port into your docker image
# you will have to expose the debug port (default 5505) like this :  EXPOSE 8085 5505
#
# Then run the container using :
#
# docker run -i --rm -p 8085:8085 balentziarra/ae-personas-jvm
#

FROM registry.access.redhat.com/ubi8/openjdk-17:1.16

USER root

WORKDIR /build
COPY ./pom.xml .

RUN mvn dependency:go-offline
COPY ./src src

ENV MAVEN_OPTS="-Xmx512m"
RUN mvn package -Dmaven.tests.skip=true

RUN grep version /target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-version
RUN grep artifactId /target/maven-archiver/pom.properties | cut -d '=' -f2 >.env-id

# If this is an uber jar, create a structure that looks the same as fast-jar with empty directories
# this allows for the same dockerfile to be used with both
RUN if [ ! -d /build/target/quarkus-app ] ; then mkdir -p /build/target/quarkus-app/lib; \
     mkdir -p /build/target/quarkus-app/app; \
     mkdir -p /build/target/quarkus-app/quarkus; \
     mv /build/target/$(cat .env-id)-$(cat .env-version)*.jar /build/target/quarkus-app/ ; \
     fi

FROM registry.access.redhat.com/ubi8/openjdk-17:1.16

#Configure the JAVA_OPTS, you can add -XshowSettings:vm to also display the heap size.
ENV JAVA_OPTS="-Dquarkus.http.host=0.0.0.0 -Dquarkus.http.port=8085 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"

# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --from=0 --chown=1001 /build/target/quarkus-app/lib/ /deployments/lib/
COPY --from=0 --chown=1001 /build/target/quarkus-app/*.jar /deployments/export-run-artifact.jar
COPY --from=0 --chown=1001 /build/target/quarkus-app/app/ /deployments/app/
COPY --from=0 --chown=1001 /build/target/quarkus-app/quarkus/ /deployments/quarkus/

EXPOSE 8080
ENTRYPOINT ["/opt/jboss/container/java/run/run-java.sh"]
