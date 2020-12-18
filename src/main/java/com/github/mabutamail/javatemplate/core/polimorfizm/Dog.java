package com.github.mabutamail.javatemplate.core.polimorfizm;

public class Dog extends Animal {

    @Override
    public void eating() {
        System.out.println("Dog eating Override!");
    }

    public void dogMethod(){
        System.out.println("Dog method run");
    }
}