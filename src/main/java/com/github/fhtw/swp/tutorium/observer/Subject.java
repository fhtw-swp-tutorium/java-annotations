package com.github.fhtw.swp.tutorium.observer;

import com.github.fhtw.swp.tutorium.NullFactory;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to be used as a marker for the subject of an observer pattern.
 * If the subject has constructor parameters, you can specify a factory class that should be used during testing to construct a subject instance.
 * The factory class should have a zero-argument constructor and a single public zero-argument method that returns an instance of the subject.
 *
 * @see RegisterObserver
 * @see UnregisterObserver
 * @see NotifyObservers
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Subject {

    Class<?> factory() default NullFactory.class;
}
