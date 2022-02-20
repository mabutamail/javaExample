package com.github.mabutamail.javatemplate.core.alishevcore;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веди возраст: ");
        String age = scanner.nextLine();
        switch (age) {
            case "0":
                System.out.println("Родился");
                break;
            case "18":
                System.out.println("закончил школу");
                break;
            default:
                System.out.println("Ничего из вышеперечисленного");

        }


    }
}
