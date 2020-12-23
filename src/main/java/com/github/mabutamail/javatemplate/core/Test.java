package com.github.mabutamail.javatemplate.core;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String s = "hello";
        s.toUpperCase();
        System.out.println(s);
        int[][] arrtwo = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9},
        };
        System.out.println(arrtwo.length);
        System.out.println(arrtwo[0].length);
        System.out.println(arrtwo[1].length);
        System.out.println(arrtwo[2].length);
        System.out.println(arrtwo[1][3]);
        System.out.println(Arrays.deepToString(arrtwo));
        System.out.println(Arrays.toString(arrtwo));

    }
}