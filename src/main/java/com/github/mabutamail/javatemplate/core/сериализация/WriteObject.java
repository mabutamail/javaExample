package com.github.mabutamail.javatemplate.core.сериализация;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "people.bin";
        File file = new File(path);

        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Tom");
        Person person3 = new Person(3, "Alex");

        Person[] people = {person1, person2, person3};

        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(people);
//            oos.writeObject(person1);
//            oos.writeObject(person2);
//            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}