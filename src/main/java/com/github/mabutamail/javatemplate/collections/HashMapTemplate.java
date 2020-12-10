//  O(N)

package com.github.mabutamail.javatemplate.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//  https://habr.com/ru/post/е128017/
public class HashMapTemplate {

    public static void main(String[] args) {
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("0", "zero111");    //перетрется следующей строкой
//        hashmap.put("0", "zero222");
        hashmap.put(null, "null");
        hashmap.put("", "пустое поле");
        hashmap.put("key", "one");
        hashmap.put(" ", "пробел");
        hashmap.put("111", "111");
        System.out.println("hashmap \t" + hashmap);
        System.out.println("isEmpty() \t" + hashmap.isEmpty());
        System.out.println("size() \t\t" + hashmap.size());
        System.out.println("hashCode(0) " + hashmap.get("0").hashCode());   //-393519511
        System.out.println("hashCode() \t" + hashmap.hashCode());   //1337348183
        System.out.println("HashMap");

        System.out.println("===================================");
        // 1.
        for (Map.Entry<String, String> entry: hashmap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());

        System.out.println("===================================");
        // 2.
        for (String key: hashmap.keySet())
            System.out.println(hashmap.get(key));

        System.out.println("===================================");
        // 3.
        Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }
}