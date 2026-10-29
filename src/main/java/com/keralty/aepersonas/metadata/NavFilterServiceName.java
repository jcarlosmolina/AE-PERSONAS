package com.keralty.aepersonas.metadata;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Classes annotated with this annotation are used to solve a navegational
 * filter service named <code>name</code>. 
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface NavFilterServiceName {

    /** The name of the service. */
    String name();
}

