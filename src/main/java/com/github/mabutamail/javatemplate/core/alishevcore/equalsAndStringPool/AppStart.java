package com.github.mabutamail.javatemplate.core.alishevcore.equalsAndStringPool;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AppStart {
    public static void main(String[] args) {
        log.info("Program start");
        List<Animal> animalList = new ArrayList<>();
        Animal animal = new Animal(1);
        Animal animal1 = new Animal();
        animal.setId(2);
        animalList.add(animal);
        animalList.add(animal1);
//        animal.id = 1;
//        System.out.println(animal);
//        System.out.println("array " + animalList);
        log.info("" + animal + "\t" + animal1);
        log.info("animalList " + animalList);
    }
}