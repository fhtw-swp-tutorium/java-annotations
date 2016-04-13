package com.github.fhtw.swp.tutorium.observer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Defines a method on a subject that unregisters / removes an observer from a subject.
 *
 * @see Subject
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UnregisterObserver {

}
