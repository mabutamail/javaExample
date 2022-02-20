package com.github.mabutamail.javatemplate.core.alishevcore.abstractclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Animal implements AbleToMakeSound {

    String name;
    int age;

    public void eat() {
        System.out.println("I am eating...");
    }

    public abstract void makeSound();
}