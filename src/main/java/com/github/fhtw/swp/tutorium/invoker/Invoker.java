package com.github.fhtw.swp.tutorium.invoker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Invoker {

    Class<?> factory() default None.class;

    class None {

    }
}
