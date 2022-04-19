package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(7);
        myLinkedList.add(2);
        myLinkedList.add(72);
        myLinkedList.add(17);
        System.out.println(myLinkedList);
//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(1));
//        System.out.println(myLinkedList.get(3));
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
//        List<Integer> linkedList = new LinkedList<>();
//        List<Integer> arrayList = new ArrayList<>();
//
//        measureTime(linkedList);
//        measureTime(arrayList);
//        linkedList.add(4);
//        linkedList.add(67);
//        linkedList.add(98);
//        log.info("linkedList " + linkedList);
//        log.info("linkedList.get(1) " + linkedList.get(1));
//        log.info("linkedList.size() " + linkedList.size());
//        log.info("linkedList.remove(0) " + linkedList.remove(0));
//        log.info("linkedList " + linkedList);
//        arrayList.add(789);
//        arrayList.add(66);
//        arrayList.add(769);
//        log.info("arrayList " + arrayList);
    }

//    public static void measureTime(List<Integer> list) {
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 100_000; i++) {
//            list.add(0, i);
//        }
//
//        long end = System.currentTimeMillis();
//        log.info("time " + (end - start));
//    }
}
