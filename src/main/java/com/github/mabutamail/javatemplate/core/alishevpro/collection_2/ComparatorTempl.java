package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class ComparatorTempl {
    public static void main(String[] args) {
        List<People> people = new ArrayList<>();
//        People people1 = new People(3, "John1");
//        People people2 = new People(3, "John2");
//        People people3 = new People(3, "John3");
//        people.add(people1);
//        people.add(people2);
//        people.add(people3);

        people.add(new People(3, "Johnnnnnn"));
        people.add(new People(2, "Alexxx"));
        people.add(new People(1, "Zal"));
        Collections.sort(people, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return Integer.compare(o2.id, o1.id);
            }
        });

        log.info("people " + people);


        List<String> animal = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(10);
        numbers.add(0);
        numbers.add(3);
//        log.info("numbers " + numbers);

//        numbers.sort(new IntReverseComparator());
//        Collections.sort(numbers, new IntReverseComparator());
        numbers.sort((o1, o2) -> o2.compareTo(o1));

//        log.info("numbers " + numbers);

//        animal.add("catty");
//        animal.add("dog");
//        animal.add("bird");
//        animal.add("frog");
//
//        log.info(" " + animal);
//
//        Collections.sort(animal, new StringLengthComparator());
////        animal.sort(new StringLengthComparator());
//
//        for (String s : animal) {
//            log.info("foreach  " + s);
//        }
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        //  o1 < o2 -> -1
        //  o1 == o2 -> 0
        //  o1 > o2 -> 1
//        return (o1.length() < o2.length()) ? -1 : ((o1.length() == o2.length()) ? 0 : 1);
        return Integer.compare(o1.length(), o2.length());
    }
}

class IntReverseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        //  o1 < o2 -> -1
        //  o1 == o2 -> 0
        //  o1 > o2 -> 1
//        return i2.compareTo(i1);
        return (i1 > i2) ? -1 : ((i1 == i2) ? 0 : 1);
    }
}

class People {
    int id;
    String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}