package com.github.mabutamail.javatemplate.core.alishevcore.serialization;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppStart {
    public static void main(String[] args) {
        log.info("Program start\n");
        Person person1 = new Person(1, "Tom");
        Person person2 = new Person(2, "Bob");
    }
}