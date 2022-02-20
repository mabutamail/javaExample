package com.github.mabutamail.javatemplate.core.alishevcore.abstractclass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppStart {
    public static void main(String[] args) {
        log.info("Program start");
        Animal dog = new Dog();
        Animal cat = new Cat();
//        Cat.builder().name("we").build();
        cat.setName("Musya");
        cat.setAge(2);
        dog.setName("Gosha");
        dog.setAge(10);

        dog.eat();
        dog.makeSound();
        cat.eat();
        cat.makeSound();
    }
}
