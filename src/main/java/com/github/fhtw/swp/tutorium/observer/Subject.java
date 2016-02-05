package com.github.fhtw.swp.tutorium.observer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to be used as a marker for the subject of an observer pattern.
 * If the subject has constructor parameters, you can specify a factory class that should be used during testing to construct a subject instance.
 * The factory class should have a zero-argument constructor and a single public zero-argument method that returns an instance of the subject.
 *
 * The class should have methods for attaching and detaching an observer and notifying all attached observers.
 * These methods are determine by a naming convention, which allows the following names:
 * <ul>
 *     <li>attachXXX</li>
 *     <li>subscribeXXX</li>
 *     <li>addXXX</li>
 *     <li>registerXXX</li>
 *     <li>detachXXX</li>
 *     <li>unsubscribeXXX</li>
 *     <li>removeXXX</li>
 *     <li>unregisterXXX</li>
 *     <li>notifyXXX</li>
 *     <li>updateXXX</li>
 * </ul>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Subject {

    Class<?> factory() default Subject.None.class;

    class None {

    }
}
