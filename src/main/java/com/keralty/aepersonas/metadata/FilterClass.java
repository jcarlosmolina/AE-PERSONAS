package com.keralty.aepersonas.metadata;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Methods annotated with this annotation are used to solve the model filter
 * named <code>name</code>. 
 * If the method solves the memory part of the filter, the value of <code>inMemory</code> will be TRUE.
 * If the method solves a part of the filter in SQL, <code>inSQL</code> is TRUE.
 * And if is a navigational filter, <code>isNavFilter</code> is TRUE.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FilterClass {

    /** The name of the model filter. */
    String name() default "";
    /** Says if the method solves the memory part of the filter or the SQL part. */
    boolean inMemory() default false;
    /** Says if the method solves the sql part of the filter or the SQL part. */
    boolean inSQL() default false;
    /** Says if the filter is a navigational filter or not */
    boolean isNavFilter() default false;
}

