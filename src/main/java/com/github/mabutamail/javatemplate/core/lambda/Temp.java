package com.github.mabutamail.javatemplate.core.lambda;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Temp {
    public static void main(String[] args) {

        int a = 5;
        Runnable runnable = () -> System.out.println("Hello world! " + a);

        System.out.println(runnable);

//        () -> System.out.println("Hello world!");

//        Consumer<Integer> c = (int x) -> { System.out.println(x) };

//        (int a, int b) -> {  return a + b; }
//
//        () -> System.out.println("Hello World");
//
//        (String s) -> { System.out.println(s); }
//
//        () -> 42
//        double d = () -> { return 3.1415 };

    }
}
