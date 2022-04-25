package com.github.mabutamail.javatemplate.core.alishevpro.junitTest;

public class MyMath {
    public static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль ");
        } else {
            return x / y;
        }
    }
}