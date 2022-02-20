package com.github.mabutamail.javatemplate.core.alishevcore;

import java.util.Scanner;

public class Lesson3 {
    public static int i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i3;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("чётное " + i);
                continue;
            }
            System.out.println("не чётное " + i);
        }

        do {
            System.out.println("qqqqqq");
        } while (scanner.nextInt() != 0);

        do {
            System.out.println("Введите 5: ");
            i3 = scanner.nextInt();
            System.out.println("вы ввели:  " + i3);
        }
        while (i3 != 5);

        String str = "my strig type";
//        int i;
//        System.out.println(str.toUpperCase().length());
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        i = 2;
        if (i == 1) {
            System.out.println(" if i = 1 " + i);
        } else {
            System.out.println(" if i <> 1 " + i);
        }
//        System.out.println("напишите что-нибудь:");
//        Scanner scanner = new Scanner(System.in);
//        String st = scanner.nextLine();
//        System.out.println(st + " qqqqq ");
//        System.out.println("введите целое число:");
//        int i1 = scanner.nextInt();
//        System.out.println("вы ввели число: " + i1);
//        while (i < 10) {
//            i++;
//            System.out.println(i);
//        }
    }
}