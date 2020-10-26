package com.github.mabutamail.javatemplate.core.generics;

import java.util.*;

public class Generics {

    private static class Box<T> {
        List<T> slots = new ArrayList<>();

        public List<T> getSlots() {
            return slots;
        }

    }

    public static void main(String[] args) {


        List<String> list = Arrays.asList("Hello", "World");
        List<Integer> data = new ArrayList<>();
        Integer intNumber = data.get(0);
        System.out.println(data);

        System.out.println("=================================");


        Box<String> catBox = new Box<>();
        String murzik = "Мурзик";
        catBox.getSlots().add(murzik);


        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(111);
        listInt.add(222);
        System.out.println(listInt);

//        List<String> list = new ArrayList<>();
//        list.add("text1");
//        list.add("text2");
//        list.add("3");
//        list.add(null);
//        list.add("");
//
//        System.out.println(list.toString());

        //  instanceof
        Object[] objects = {10, "Привет", 3.14, "zzz"};

        for (Object object : objects) {
            if (object instanceof String) {
                String s = (String) object;
                System.out.println(s);
            }
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(7, "Привет7");
        map.put(-15, "Привет15");

        for (Map.Entry<Integer, String> entry : map.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());

        System.out.println("=================================");


//        You cannot create arrays of parameterized types. For example, the following code does not compile:
//        List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error
//        List<Integer>[] list1 = new ArrayList<?>[10];    //  что не так???

        List<Integer>[] array = new ArrayList[5];   //  что не так???
        array[0] = listInt;
        System.out.println(Arrays.toString(array));


        System.out.println("=================================");

        List<String> listHello = new ArrayList<>();
        listHello.add("Привет");
        listHello.add("Hi");

//список прощаний
        List<String> listBye = new ArrayList<>();
        listBye.add("Пока");
        listBye.add("Good Bye");

//список списков
        List<List<String>> lists = new ArrayList<>();
        lists.add(listHello);
        lists.add(listBye);

        System.out.println(lists);


    }
}
