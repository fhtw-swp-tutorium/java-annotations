package com.github.fhtw.swp.tutorium.composite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a leaf of the compositum pattern.
 *
 * @see Composite
 * @see AddComponent
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Leaf {

}
