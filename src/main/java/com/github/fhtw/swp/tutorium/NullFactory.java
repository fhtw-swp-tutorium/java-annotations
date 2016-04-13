package com.github.fhtw.swp.tutorium;

import com.github.fhtw.swp.tutorium.command.Invoker;
import com.github.fhtw.swp.tutorium.composite.Composite;
import com.github.fhtw.swp.tutorium.decorator.Decorator;
import com.github.fhtw.swp.tutorium.observer.Subject;

/**
 * Dummy class to indicate that no factory should be used to construct a certain type.
 *
 * @see Subject
 * @see Invoker
 * @see Decorator
 * @see Composite
 */
public final class NullFactory {

    /**
     * No instances allowed.
     */
    private NullFactory() { }
}
