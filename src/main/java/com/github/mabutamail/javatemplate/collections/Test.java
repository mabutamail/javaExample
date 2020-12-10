package com.github.mabutamail.javatemplate.collections;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("program start");
        List<Integer> arrayList = new ArrayList<>(100);
        arrayList.add(0, 333);
        arrayList.set(0, 339993);
//        arrayList.add(1, 444);
//        arrayList.add(1, null);
//        arrayList.add(1, null);
//        arrayList.set(1, 888);
//        arrayList.add(1, null);
//        arrayList.add(777777777);
//        System.out.println(arrayList.get(0));
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i, i);
//        }
//        System.out.println(arrayList.toString());
//        System.out.println(arrayList.get(10));
//        arrayList.remove(10);
        System.out.println(arrayList);
        System.out.println(arrayList.size());


    }
}