package com.github.mabutamail.javatemplate.core.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionsTemplate {

    //  https://javarush.ru/quests/lectures/questsyntaxpro.level14.lecture03
    //  https://habr.com/ru/company/golovachcourses/blog/223821/
    //  https://habr.com/ru/company/golovachcourses/blog/225585/

    //    Ключевые слова: try, catch, finally, throw, throws
    //    Throwable - класс
    //    Error
    //    Exception
    //    Compile time exception    Checked     обрабатываем или пробрасываем выше
    //    RuntimeException          Unchecked   исправляем ошибку в программе (/0 например)
    //    try with resources        AutoCloseable
    //    trow  trows

    public static void main(String[] args) throws Throwable {


//        System.err.println("ERROR");

        Throwable throwable = new Throwable();
//        throw throwable;
        throwable.getCause();

        Error error = new Error();
        error.getCause();

        Exception exception = new Exception();
        exception.printStackTrace();

        RuntimeException runtimeException = new RuntimeException();
        runtimeException.getMessage();

        StackOverflowError stackOverflowError = new StackOverflowError();
        stackOverflowError.getMessage();

        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        arrayIndexOutOfBoundsException.getCause();


        try {
//            throw new Exception("Exception");
            throw new Throwable("Throwable");
        } catch (Exception e) {
            e.printStackTrace();
        }


        int a = 0, b = 0, c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

        try {
            calculate(0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("выполняется всегда");
        }


        String src = "c:\\projects\\log.txt";
        String dest = "c:\\projects\\copy.txt";

        try (FileInputStream input = new FileInputStream(src);
             FileOutputStream output = new FileOutputStream(dest)) {
            byte[] buffer = input.readAllBytes();
            output.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void calculate(int n) throws Exception {
        if (n == 0)
            throw new Exception("n равно нулю!");
    }
}