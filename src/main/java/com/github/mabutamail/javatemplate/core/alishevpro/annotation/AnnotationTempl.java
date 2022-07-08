package com.github.mabutamail.javatemplate.core.alishevpro.annotation;

@MyAnnotation
public class AnnotationTempl {
    @MyAnnotation
    private String name;

    @MyAnnotation
    public AnnotationTempl() {
    }

    @MyAnnotation
    public void test(@MyAnnotation int value) {
        @MyAnnotation String localVar = "Hello";
    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {
    }
}