package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Slf4j
public class EqualsAndHashCode {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        Set<Integer> set = new HashSet<>();
//
//        map.put(1, "One");
//        map.put(1, "Other");
//        set.add(1);
//        set.add(1);
//
//        log.info("map " + map);
//        log.info("set " + set);

        Integer i = 1;
        log.info("" + i.equals(1));
        log.info("" + i.hashCode());

        Map<Person, String> mapPerson = new HashMap<>();
        Set<Person> setPerson = new HashSet<>();

        Person person1 = new Person(1, "Tom");
        Person person2 = new Person(1, "Tom");

        mapPerson.put(person1, "123");
        mapPerson.put(person2, "123");
        setPerson.add(person1);
        setPerson.add(person2);

        log.info("mapPerson " + mapPerson);
        log.info("setPerson " + setPerson);
    }
}

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

}