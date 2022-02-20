package com.github.mabutamail.javatemplate.core.alishevcore.abstractclass;

import lombok.Builder;

@Builder
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Мяяууу!");
    }
}