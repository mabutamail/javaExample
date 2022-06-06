package com.github.mabutamail.javatemplate.core.alishevpro.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaTempl2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println("arr\t\t" + Arrays.toString(arr));
        System.out.println("list\t" + list);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] * 2;
//            list.set(i, list.get(i) * 2);
//        }

        //  map method
//        arr = Arrays.stream(arr).map(x -> x * 2).toArray();
//        list = list.stream().map(x -> x * 2).collect(Collectors.toList());
//
//        System.out.println("========================================");
//        System.out.println("arr\t\t" + Arrays.toString(arr));
//        System.out.println("list\t" + list);
//
//        arr = Arrays.stream(arr).map(x -> 3).toArray();
//        list = list.stream().map(x -> 3).collect(Collectors.toList());
//
//        System.out.println("========================================");
//        System.out.println("arr\t\t" + Arrays.toString(arr));
//        System.out.println("list\t" + list);

//  +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //  filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a%2 != 0).toArray();
        list2 = list2.stream().filter(a -> a%2 == 0).collect(Collectors.toList());

        System.out.println("==================      filter      ======================");
        System.out.println("arr\t\t" + Arrays.toString(arr2));
        System.out.println("list\t" + list2);


        //  foreach
        System.out.println("===================     foreach     =====================");
        Arrays.stream(arr2).forEach(a -> System.out.print("arr\t" + a + "\t"));
        System.out.println();
        list2.stream().forEach(a -> System.out.print("list\t" + a + "\t"));


        //  reduce
        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);

        int sumArr = Arrays.stream(arr3).reduce((acc, x) -> acc + x).getAsInt();
        int sumList = list3.stream().reduce((acc, x) -> acc * x).get();

        System.out.println("\n===================       reduce      =====================");
        System.out.println("sumArr\t\t" + sumArr);
        System.out.println("sumList\t\t" + sumList);

        System.out.println("===================     несколько методов друг за другом     =====================");
        arr3 =  Arrays.stream(arr3).filter(x -> x % 2 != 0).map(x -> x * 2).toArray();
        System.out.println(Arrays.toString(arr3));

        System.out.println("===================     с любыми коллекциями     =====================");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println("set before\t" + set);
        set = set.stream().map(x -> x * 3).collect(Collectors.toSet());
        System.out.println("set after\t" + set);

    }


    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }

}