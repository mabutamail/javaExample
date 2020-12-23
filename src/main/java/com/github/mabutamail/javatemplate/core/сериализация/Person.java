package com.github.mabutamail.javatemplate.core.сериализация;

import java.io.Serializable;

public class Person implements Serializable {
//    private static final long serialVersionUID = 5638921115202984604L;
    private int id;
    //  transient поля не сериализуются
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}