package com.github.mabutamail.javatemplate.core;

public class StringBuilderTempl {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        long t1 = System.currentTimeMillis();
        sb.append(" word").append(" yahoo!!!");
//        for (int i = 0; i < 10_000; i++) {
//            sb.append(" word").append(i);
//        }
        long t2 = System.currentTimeMillis();
        long t3 = t2 - t1;
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println( t3 + " = " + t2 + " - " + t1); //1700 -> 10// 24000 -> 20
    }
}
