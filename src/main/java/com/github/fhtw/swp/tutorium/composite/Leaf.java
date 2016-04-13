package com.github.fhtw.swp.tutorium.composite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Leaf {

    /**
     * @return The component class of this leaf.
     */
    Class<?> value();
}
