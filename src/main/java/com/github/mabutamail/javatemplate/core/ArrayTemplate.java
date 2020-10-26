package com.github.mabutamail.javatemplate.core;

import java.util.Arrays;

//  https://javarush.ru/groups/posts/massivy-java
public class ArrayTemplate {

    public static void main(String[] args) {

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