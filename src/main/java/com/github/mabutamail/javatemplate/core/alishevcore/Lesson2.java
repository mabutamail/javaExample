package com.github.mabutamail.javatemplate.core.alishevcore;
//private ... protected public
public class Lesson2 {
    private static int i = 32;        //32

    public static void main(String[] args) {
        byte b = 127;      //8     -128..127
        short s = 32000;    //16
        //int i = 1;        //32
        long l = 1L;       //64

        float f = 123.45f;  //32
        double d = 456.7d;   //64

        char c = 'c';       //16
        boolean bool = true;
        Integer integer = i;
        System.out.println(integer);
    }

}