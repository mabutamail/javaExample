package com.github.mabutamail.javatemplate.core;

public class ObjectTempl {
    public static void main(String[] args) {
        Object o = new Object();

        System.out.println(o);
        System.out.println(o.toString());

        String s = o.toString();
        Boolean b = o.equals("");
        int i = o.hashCode();
        Class getClass = o.getClass();
//        Object o1 = o.clone().getClass();
//        String n = o.notify();
//        String w = o.wait();
    }
}