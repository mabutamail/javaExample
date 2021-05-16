package com.github.mabutamail.javatemplate.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTrmplate {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("string1");
        set.add("string1");
        set.add("string2");
        for (String s : set) {
            System.out.println(s);
        }
        set.remove("string1");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
