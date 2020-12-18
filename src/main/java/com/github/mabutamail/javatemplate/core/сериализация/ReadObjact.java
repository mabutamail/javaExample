package com.github.mabutamail.javatemplate.core.сериализация;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjact {
    public static void main(String[] args) {

        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "people.bin";
        File file = new File(path);

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person[] person = (Person[]) ois.readObject();
//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();
//            System.out.println(person1);
//            System.out.println(person2);
            System.out.println(Arrays.toString(person));
//            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}