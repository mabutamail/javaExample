package com.github.mabutamail.javatemplate.core;

public class Полиморфизм {
    //    например перегрузка методов
    //    один метод - разное поведение
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.print();
        b.print();
    }

    public interface SomeInterface {
        void print();
    }

    public static class A implements SomeInterface{
        @Override
        public void print() {
            System.out.println("A");
        }
    }

    public final static class B extends A {
        public void print() {
            System.out.println("B");
        }
    }

}