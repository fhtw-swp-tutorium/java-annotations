package com.github.fhtw.swp.tutorium.composite;

import com.github.fhtw.swp.tutorium.NullFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Composite {

    /**
     * @return The component class of this leaf.
     */
    Class<?> value();

    /**
     * Defines a factory class that if specified is used to construct instances of the annotated class.
     * Necessary if the annotated class does NOT provide a zero-argument constructor.
     *
     * The referenced class MUST provide a zero-argument constructor and a single public zero-argument method that returns an instances of the annotated class.
     * @return The factory class
     */
    Class<?> factory() default NullFactory.class;
}
