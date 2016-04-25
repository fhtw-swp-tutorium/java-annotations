package com.github.fhtw.swp.tutorium;

/**
 * A Factory allows the user to define arbitrary construction-logic when construct a certain object.
 * This is usually necessary if the target-class does not provide a zero-argument constructor.
 *
 * Implementations of this interface MUST provide a zero-argument constructor.
 * Example:
 *
 * <pre>
 *
 *    {@literal @}Subject(factory = ComplexSubjectFactory.class)
 *     public class ComplexSubject {
 *
 *         public ComplexSubject(Object dependency) {
 *              // ComplexSubject relies on this parameter
 *         }
 *     }
 *
 *     public class ComplexSubjectFactory implements Factory {
 *
 *         public Object getInstance() {
 *              return new ComplexSubject(new Object());
 *         }
 *     }
 *
 * </pre>
 *
 * Note that without the factory, no instances of ComplexSubject could be created because the values of the parameters cannot be reliably guessed at runtime.
 * Also note that this concrete mechanism is only necessary for testing the given classes and should not be used for solving production issues.
 */
public interface Factory {

    Object getInstance();

}
