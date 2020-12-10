//  O(N)

package com.github.mabutamail.javatemplate.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTemplate {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);
        list.add(1);
        list.add(33);
        list.add((int) 3.33);
        list.add(null);
        list.add(4, 100);
        list.add(0, 99);
        list.remove(5);
//        Arrays.sort(list.toArray());
        //    ???
        System.out.println("list.size() " + list.size());
        ((ArrayList<Integer>) list).trimToSize();
        System.out.println("list.size() " + list.size());

//        System.arraycopy();

        System.out.println(list.size());
        System.out.println(list);
        System.out.println("list.hashCode() " + list.hashCode());        //120119327
        System.out.println(list.get(3));
        System.out.println(list.get(0).hashCode());
        System.out.println(list.isEmpty());

        System.out.println("\n=====================================");
        for (Integer i : list) {
            System.out.println(i);
        }

        list.clear();
        System.out.println(list);
    }
}