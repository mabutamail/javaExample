package com.github.mabutamail.javatemplate.core.alishevpro.arrayList;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Stack;

@Slf4j
public class ArrayListTempl {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
//        List<String> list = new Vector<>();
        List<String> list = new Stack<>();
        list.add("list1");
        list.add("list2");
        list.add("list3");
        log.info("list.get \t" + list.get(2));
        log.info("list.size \t" + list.size());
        log.info("list \t\t" + list);
        log.info("list.remove " + list.remove(1));
        log.info("list \t\t" + list);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}