package com.github.mabutamail.javatemplate.collections;

import java.util.*;

public class MapTemplate {
    public static void main(String[] args) {
//        https://habr.com/ru/post/128017/
        Map<String, String> hashMap = new HashMap<>();              //  не упорядоченная
        Map<String, String> treeMap = new TreeMap<>();              //  в виде дерева
        Map<String, String> hashTable = new Hashtable<>();          //  синхронизирована
        Map<String, String> linkedHashMap = new LinkedHashMap<>();  //  упорядоченная
        hashMap.put("1","one");
        hashMap.put("2","two");
        hashMap.put("3","three");
        hashMap.put("4","four");
        hashMap.put("4","fife");
        hashMap.put("6","Иван Иванович Иванов");

        System.out.println(hashMap.get("3"));

        Set set = hashMap.entrySet();
        System.out.println("EntrySet " + set);

        for (Object s:set) {
            System.out.println("====================== " + s);
        }

        System.out.println(hashMap);
        System.out.println(hashMap.get("6"));
        System.out.println(hashMap.containsKey("6"));

        Set<String> keys = hashMap.keySet();
        System.out.println("Ключи " + keys);
        List<String> value = new ArrayList<>(hashMap.values());
        System.out.println("Значения " + value);

        hashMap.remove("6");
        System.out.println(hashMap.containsKey("6"));
        System.out.println(hashMap.get(null));

        for (Map.Entry<String, String> entry: hashMap.entrySet()){
            System.out.println("Все ключ-значение " + entry);
        }
    }

}
