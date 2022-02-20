package com.github.mabutamail.javatemplate.core.alishevcore.modificator;

public class Test {
     static void method(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("test");
        Test.method();
    }
}
class Test1{
    public static void main(String[] args) {
        Test.method();
    }
}