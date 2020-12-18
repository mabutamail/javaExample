package com.github.mabutamail.javatemplate.core;

import java.util.Arrays;

//  https://javarush.ru/groups/posts/massivy-java
public class ArrayTemplate {

    public static void main(String[] args) {

        int[][] arrtwo = {
                {1, 2, 3, 34, 432},
                {4, 5, 6, 7},
                {8, 9},
        };
        System.out.println(arrtwo.length + " Число строк в двумерном массиве");
        System.out.println(arrtwo[0].length + " Число значений в 1 строке");
        System.out.println(arrtwo[1].length + " Число значений во 2 строке");
        System.out.println(arrtwo[2].length + " Число значений в 3 строке");
        System.out.println(arrtwo[1][3] + " значение в ячейке");
        System.out.println(Arrays.deepToString(arrtwo) + " Arrays.deepToString(arrtwo)");
        System.out.println(Arrays.toString(arrtwo) + " Arrays.toString(arrtwo)");
        System.out.println(arrtwo + " arrtwo");
        System.out.println("\n================================");

        int[] array = new int[12];
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        int[][] myTwoDimentionalArray = new int[8][8];
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.equals(numbers, numbersCopy));


        for (int i = 1; i < array.length + 1; i++) {
            array[i - 1] = i * i;
        }

        array[5] = 555;
        System.out.println("array \t\t\t\t\t" + array);
        System.out.println("array.length \t\t\t" + array.length);
        System.out.println("array[0] \t\t\t\t" + array[0]);
        System.out.println("array[9] \t\t\t\t" + array[9]);
        System.out.println("Arrays.toString(array)\t" + Arrays.toString(array));

//        Arrays.sort(array, 0, array.length);
        Arrays.sort(array);

        System.out.println("Arrays.sort(array)\t\t" + Arrays.toString(array));
        System.out.println("Arrays.hashCode(array)\t" + Arrays.hashCode(array));
        System.out.println(Arrays.binarySearch(array, 16));

        System.out.println("\n================================");
        System.out.println(Arrays.toString(seasons));

    }
}