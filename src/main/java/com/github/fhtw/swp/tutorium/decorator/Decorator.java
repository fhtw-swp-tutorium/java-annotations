package com.github.fhtw.swp.tutorium.decorator;

import com.github.fhtw.swp.tutorium.Factory;
import com.github.fhtw.swp.tutorium.NullFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a decorator of the decorater pattern.
 *
 * @see Component
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Decorator {

    /**
     * Defines a factory class that if specified is used to construct instances of the annotated class.
     *
     * @return The factory class
     * @see Factory
     */
    Class<? extends Factory> factory() default NullFactory.class;
}
