package com.github.mabutamail.javatemplate.core.alishevcore.serialization;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Arrays;

@Slf4j
public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("people.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));
//            int personCount = ois.readInt();
//
//            Person[] people = new Person[personCount];
//
//            for (int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }
//            System.out.println(Arrays.toString(people));

//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();
//
//            System.out.println(person1);
//            System.out.println(person2);

//            ois.close();
            log.info("Read object");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        log.info("End program");

    }
}