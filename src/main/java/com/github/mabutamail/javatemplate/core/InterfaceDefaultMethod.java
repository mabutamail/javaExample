package com.github.mabutamail.javatemplate.core;

public class InterfaceDefaultMethod { //implements ru.zalex.javatemplate.core.InterfaceA, InterfaceB {

    public static void main(String[] args) {
        //metod();
    }
}


interface InterfaceA {
    static void metod() {

    }

    default void metodA() {
        System.out.println("ru.zalex.javatemplate.core.InterfaceA");
    }
}

//interface InterfaceB {
//    void metod();
//
//    default void metodA() {
//        System.out.println("InterfaceB");
//    }
//}