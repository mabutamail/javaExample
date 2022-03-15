package com.github.mabutamail.javatemplate.core.alishevcore.serialization;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class WriteObject {
    public static void main(String[] args) throws FileNotFoundException {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        Person person3 = new Person(3, "Tom");
        Person[] people = {person1, person2, person3};
//        Person[] people = {new Person(1, "Bob"), new Person(2, "Mike"),  new Person(3, "Tom")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            oos.writeObject(people);
            log.info("Write objects");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileOutputStream fos = new FileOutputStream("people.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(people);
//
////            oos.writeInt(people.length);
////
////            for (Person person : people) {
////                oos.writeObject(person);
////            }
//
////            oos.writeObject(person1);
////            oos.writeObject(person2);
////
////            System.out.println(person1);
////            System.out.println(person2);
//
//            oos.close();
//            log.info("Write objects");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        log.info("End program");

    }
}