package com.github.fhtw.swp.tutorium.decorator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a decorator of the decorator pattern.
 *
 * @see Component
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Decorator {

    /**
     * Defines the decorated class of this decorator. Also referred to as "Component".
     */
    Class<?> value();
}
