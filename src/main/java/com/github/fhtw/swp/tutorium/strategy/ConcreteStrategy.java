package com.github.fhtw.swp.tutorium.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a concrete strategy of the strategy pattern.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ConcreteStrategy {

    /**
     * @return The interface of this strategy.
     */
    Class<?> value();
}
