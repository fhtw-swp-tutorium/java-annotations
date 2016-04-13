package com.github.fhtw.swp.tutorium.composite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a method on a composite which allows to add further components.
 * This method MUST take a single parameter whose type is the component.
 *
 * @see Composite
 * @see Leaf
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AddComponent {

}
