package com.github.mabutamail.javatemplate.core;

public class PrintfTempl {
    public static void main(String[] args) {
        int i = 123_456;
        String r = "СЛОНЫ ПОШЛИ НА СЕВЕР!";
        System.out.printf("%f это %d пример %s\n", 10.345, i, r);

        System.out.printf("%d\n",123);
        System.out.printf("%10d\n", 123);
        System.out.printf("%10d\n", 123456);
        System.out.printf("%10d\n", 1234567890);

        System.out.printf("%-10d\n", 123);
        System.out.printf("%-10d\n", 123456);
        System.out.printf("%-10d\n", 1234567890);
        System.out.println("======================");
        System.out.printf("%100.2f\n", 123.4549);
        System.out.printf("%.2f\n", 123.4567890);
        System.out.printf("%.4f\n", 123.4567890);
    }
}