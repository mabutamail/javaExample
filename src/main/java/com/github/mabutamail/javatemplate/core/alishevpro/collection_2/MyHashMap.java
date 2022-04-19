package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();    //  не гарантирует порядок но быстрый
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();    //  сохраняется порядок добавления
        Map<Integer, String> treeMap = new TreeMap<>();    //  сортировка по ключу
//        map.put("dog", "собака");
//        map.put("cat", "кошка");
//        map.put("elefant", "слон");
//        log.info("map " + map);
//        map.put(2, "======");
//        log.info("map " + map);
//        log.info("map.get() " + map.get(1));
//        log.info("map.get() " + map.get(11));

//        log.info("map.entrySet() " + map.entrySet());
//        map.forEach((key, value) -> log.info(key + " : " + value));
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            log.info(entry.getKey() + " : " + entry.getValue());
//        }

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(11, "Mike");
        map.put(78, "Alex");
        map.put(1, "John");
        log.info(" " + map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            log.info(entry.getKey() + " : " + entry.getValue());
        }
    }
}