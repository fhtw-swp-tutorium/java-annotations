package com.github.fhtw.swp.tutorium.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to be used as a marker for the invoker of a command pattern.
 * If the invoker has constructor parameters, you can specify a factory class that should be used during testing to construct an invoker instance.
 * The factory class should have a zero-argument constructor and a single public zero-argument method that returns an instance of the subject.
 *
 * @see InvokeCommand
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Invoker {

    Class<?> factory();
}
