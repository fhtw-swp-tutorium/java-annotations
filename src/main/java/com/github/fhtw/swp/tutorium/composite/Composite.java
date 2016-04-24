package com.github.fhtw.swp.tutorium.composite;

import com.github.fhtw.swp.tutorium.Factory;
import com.github.fhtw.swp.tutorium.NullFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a composite of the compositum pattern.
 *
 * @see Leaf
 * @see AddComponent
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Composite {

    /**
     * @return The component class of this composite.
     */
    Class<?> value();

    /**
     * Defines a factory class that if specified is used to construct instances of the annotated class.
     *
     * @see Factory
     */
    Class<? extends Factory> factory() default NullFactory.class;
}
