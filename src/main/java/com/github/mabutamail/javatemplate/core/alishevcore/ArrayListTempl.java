package com.github.mabutamail.javatemplate.core.alishevcore;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTempl {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
//        list = new LinkedList<>();
        System.out.println(list.size());
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list.size());

        list.set(3, 11);
        for (Integer i : list) {
            System.out.print(list.get(i));
        }
        list.remove(0);
        System.out.println("\n==========================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }


//        System.out.println(arrayList.size());
//        System.out.println(arrayList);
//        System.out.println(arrayList.get(10));
//
//        Integer[] x = new Integer[4];
//        for (int i = 0; i < 4; i++) {
//            x[i] = 1;
//        }
        System.out.println("\nEND");
    }
}