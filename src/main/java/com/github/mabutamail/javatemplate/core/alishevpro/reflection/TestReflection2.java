package com.github.mabutamail.javatemplate.core.alishevpro.reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

@Slf4j
public class TestReflection2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        //  класс1 класс2 метод
        //  com.github.mabutamail.javatemplate.core.alishevpro.reflection.Person java.lang.String setName
        //  java.lang.Thread java.lang.String setName
        String firstClass = scanner.next();
        String secondClass = scanner.next();

        Class classObject1 = Class.forName(firstClass);
        Class classObject2 = Class.forName(secondClass);
        String methodName = scanner.next();

        Method method = classObject1.getMethod(methodName, classObject2);
        Object o1 = classObject1.getDeclaredConstructor().newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        method.invoke(o1, o2);

//        log.info(firstClass + " " + secondClass + " " + methodName);
        log.info("" + o1);
    }
}