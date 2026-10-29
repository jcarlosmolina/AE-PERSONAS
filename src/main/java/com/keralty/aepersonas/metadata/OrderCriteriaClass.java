package com.keralty.aepersonas.metadata;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Methods annotated with this annotation are used to solve the model order criteria
 * named <code>name</code>. 
 * If the method solves the memory part of the order criteria,
 * the value of <code>inMemory</code> is TRUE.
 * And if the method solves in SQL a part of the order criteria,
 * the value of <code>inSQL</code> is TRUE
 *
 * @since ${lTranslatorName} ${lVersion}
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface OrderCriteriaClass {
    /** The name of the model order criteria. */
    String name() default "";

    /** Says if the method solves the memory part of the order criteria. */
    boolean inMemory() default false;
    
    /** Says if the method solves the sql part of the order criteria. */
    boolean inSQL() default false;
}
