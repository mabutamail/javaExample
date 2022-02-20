package com.github.mabutamail.javatemplate.core.alishevcore.equalsAndStringPool;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AppStart {
    public static void main(String[] args) {
        log.info("Program start \n");
        int i = 3;
        int i1 = 3;
        Integer i2 = 3;
        Integer i3 = 3;
        log.info("primiives " + (i == i1));
        log.info("Class == " + (i == i2));
        log.info("Class equals " + i2.equals(i));
        log.info(String.valueOf(i2==i3));
        log.info(String.valueOf(i2.equals(i3)) + "\n");

//        String s1 = "text";
//        String s2 = "text";
//        String s3 = new String("text");
//        log.info("== " + String.valueOf(s1 == s2));
//        log.info("equals " + String.valueOf(s1.equals(s2)));
//        log.info("== with new " + String.valueOf(s1 == s3));
//        log.info("equals with new " + String.valueOf(s1.equals(s3)));

        List<Animal> animalList = new ArrayList<>();
        Animal animal = new Animal();
        Animal animal1 = new Animal();
//        animal.setId(2);
        animalList.add(animal);
        animalList.add(animal1);
//        animal.id = 1;
//        System.out.println(animal);
//        System.out.println("array " + animalList);
        log.info("" + animal + "\t" + animal1);
        log.info("animalList " + animalList);
        log.info("equals " + animal.equals(animal1));
//        System.out.println(animal == animal1);
        log.info("== " + String.valueOf(animal == animal1));

    }
}