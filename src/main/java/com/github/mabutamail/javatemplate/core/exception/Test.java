package com.github.mabutamail.javatemplate.core.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // NPE Runtime Unchecked Exception
//        String name = null;
//        name.length();

        try {
//            создаем свою ошибку
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Вызвали ошибку");
        }

        //  обрабатываем ошибку с помощью try-catch
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в catch");
//            e.printStackTrace();  //типовая обработка ошибки
        }

        // Вызвали собственноручно созданную ошибку
        try {
            throw new MyException("Наша ошибка");
        } catch (MyException e) {
            System.out.println("Вызвали собственноручно созданную ошибку");
        }
    }

    //  пробрасываем ошибку выше с помощью throws
    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }
}