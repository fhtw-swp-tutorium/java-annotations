package com.github.fhtw.swp.tutorium.composite;

import com.github.fhtw.swp.tutorium.ArgumentsProvider;
import com.github.fhtw.swp.tutorium.NoArgumentsProvider;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a method on a component
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ComponentOperation {

    Class<? extends ArgumentsProvider> argumentsProvider() default NoArgumentsProvider.class;
}
