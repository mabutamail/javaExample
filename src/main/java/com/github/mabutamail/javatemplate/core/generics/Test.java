package com.github.mabutamail.javatemplate.core.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collection<Integer> collectionList = new ArrayList<>();
        Iterable<Integer> iterableList = new ArrayList<>();


        list.add(1);
        arrayList.add(1);
        collectionList.add(1);
        iterableList.toString();
    }

}