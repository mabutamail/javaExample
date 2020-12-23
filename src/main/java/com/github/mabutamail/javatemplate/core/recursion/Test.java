package com.github.mabutamail.javatemplate.core.recursion;

public class Test {
    public static void main(String[] args) {
//        counter(10);
        System.out.println(factorial(2));
    }

    public static void counter(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        counter(n - 1);
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}