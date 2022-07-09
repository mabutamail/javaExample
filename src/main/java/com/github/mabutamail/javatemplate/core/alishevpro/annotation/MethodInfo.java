package com.github.mabutamail.javatemplate.core.alishevpro.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target({ElementType.METHOD, ElementType.TYPE})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "Zalex";
    int dateOfCreation() default 2019;
    String purpose();

}