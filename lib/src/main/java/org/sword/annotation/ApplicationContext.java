package org.sword.annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

/**
 * Marker Annotation that forces Dagger to use ApplicationContext.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({TYPE, FIELD, METHOD,
        PARAMETER, CONSTRUCTOR,
        LOCAL_VARIABLE})
@Documented
@Qualifier
public @interface ApplicationContext {
}
