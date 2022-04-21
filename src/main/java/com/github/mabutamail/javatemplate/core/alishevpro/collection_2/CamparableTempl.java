package com.github.mabutamail.javatemplate.core.alishevpro.collection_2;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class CamparableTempl {
    public static void main(String[] args) {
        List<Peoplee> peopleList = new ArrayList<>();
        Set<Peoplee> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        log.info("peopleList " + peopleList);
        log.info("peopleSet" + peopleSet);

    }

    public static void addElements(Collection<Peoplee> collection) {
        collection.add(new Peoplee(77, "Alex"));
        collection.add(new Peoplee(2, "ZAlex"));
        collection.add(new Peoplee(33, "Tom"));
        collection.add(new Peoplee(1, "A"));
    }
}

class Peoplee implements Comparable<Peoplee> {
    private int id;
    private String name;

    public Peoplee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Peoplee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Peoplee peoplee = (Peoplee) o;

        if (id != peoplee.id) return false;
        return name != null ? name.equals(peoplee.name) : peoplee.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Peoplee o) {
//        return Integer.compare(this.getId(), o.getId());
        return Integer.compare(this.name.length(), o.getName().length());
//        return this.getId() > o.getId() ? 1 : (this.getId() < o.getId() ? -1 : 0);
    }
}