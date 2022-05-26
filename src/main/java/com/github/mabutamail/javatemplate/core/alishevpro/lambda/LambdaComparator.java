package com.github.mabutamail.javatemplate.core.alishevpro.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class LambdaComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Goodbye");
        list.add("No");
        list.add("Yes");

        log.info("" + list);

        Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(), o2.length());
        list.sort(comparator);
//        list.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
////                return (o1.length() > o2.length()) ? 1 : (o1.length() < o2.length()) ? -1 : 0;
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        log.info("" + list);
    }
}
