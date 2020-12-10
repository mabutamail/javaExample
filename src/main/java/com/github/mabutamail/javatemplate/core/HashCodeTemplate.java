package com.github.mabutamail.javatemplate.core;

public class HashCodeTemplate {
    int i;
    String name;

    public HashCodeTemplate(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public static void main(String[] args) {
        HashCodeTemplate hashCode = new HashCodeTemplate(1, "name");

        Integer integer = 123;
        String s = "string";    //-891985903
        String s1 = "string1";    //-1881759168
//        integer.hashCode();
        System.out.println(integer.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(hashCode.hashCode());    //748658608
    }
}