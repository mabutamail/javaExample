package com.github.mabutamail.javatemplate.algoritm;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, -1, 3, 7, 10, 25, 232, 1};
        int k = 232;
        System.out.println(binarySearch(arr, k));
    }

    public static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < arr[middle]) {
                high = middle - 1;
            } else if (key > arr[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

