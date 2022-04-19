package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Slf4j
public class MySet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

//        hashSet.add("Mike");
//        hashSet.add("Katy");
//        hashSet.add("Tom");
//        hashSet.add("George");
//        hashSet.add("Donald");
//
//        log.info(" " + hashSet.contains("Tomw"));

//        for (String name : hashSet) {
//            System.out.println("свой foreeach " + name);
//        }

//        testSet(hashSet);
//        testSet(linkedHashSet);
//        testSet(treeSet);

        // объединение множеств
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        fillSet(set1, 0, 10);
        fillSet(set2, 5, 15);
        log.info("объединение множеств set1 " + set1);
        log.info("объединение множеств set2 " + set2);

        // union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        log.info("объединение множеств union " + union);

        // intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        log.info("пересечение множеств intersection " + intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        log.info("разность множеств difference " + difference);

    }

    public static void testSet(Set<String> set) {
        log.info("======================================================");
        set.add("Mike");
        set.add("Katy");
        set.add("Tom");
        set.add("George");
        set.add("Donald");
        log.info("set " + set);
    }

    public static void fillSet(Set set, int sizeFrom, int sizeTo) {
        for (int i = sizeFrom; i < sizeTo; i++) {
            set.add(i);
        }
    }

}