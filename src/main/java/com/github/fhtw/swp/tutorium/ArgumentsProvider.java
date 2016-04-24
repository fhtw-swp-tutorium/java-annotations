package com.github.fhtw.swp.tutorium;

/**
 * An {@link ArgumentsProvider} returns an array of instances that match to the argument-types of the annotated method.
 * If the annotated method does not have any arguments, the {@link NoArgumentsProvider} is declared as the default which returns a zero-length array.
 *
 * {@link ArgumentsProvider} are necessary for invoking a method that has more than zero arguments because it is not feasible to determine the correct arguments to correctly invoke the method.
 *
 * Example:
 *
 * <pre>
 * public class HelloWorld {
 *
 *    {@literal @}Action(argumentsProvider=SayHelloArgumentsProvider.class)
 *     public void sayHello(String name) {
 *         System.out.println("Hello " + name);
 *     }
 * }
 *
 * public class SayHelloArgumentsProvider implements ArgumentsProvider {
 *      {@literal @}Override
 *       public Object[] getArguments() {
 *           return new Object[] { "Thomas" };
 *       }
 * }
 *
 * Note that the types returned in the arguments array of SayHelloArgumentsProvider (String) match signature of the annotated method (sayHello).
 * Also, as the method only accepts one parameter, the ArgumentsProvider returns an array of length one.
 * </pre>
 */
public interface ArgumentsProvider {
    Object[] getArguments();
}
