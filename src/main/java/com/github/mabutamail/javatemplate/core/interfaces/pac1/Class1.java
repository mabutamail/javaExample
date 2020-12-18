package com.github.mabutamail.javatemplate.core.interfaces.pac1;

import com.github.mabutamail.javatemplate.core.interfaces.InterfaceTempl;

public class Class1 implements InterfaceTempl {
    private String name;

    public Class1(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Метод инфо класса1 папки1 " + name);
    }

    public void info1(){
        System.out.println("Метод инфо1 класса1 папки1" + name);
    }

}