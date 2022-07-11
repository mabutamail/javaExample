package com.github.mabutamail.javatemplate.core.alishevpro.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class<Person> personClass = Person.class;
        Class personClass2 = person.getClass();
        Class personClass3 = Class.forName("com.github.mabutamail.javatemplate.core.alishevpro.reflection.Person");

        Method[] methods = personClass.getMethods();
//        Field[] fields = personClass.getFields();
        Field[] fields = personClass.getDeclaredFields();

//        for (Method method : methods) {
//            System.out.println(method.getName() + " , " + method.getReturnType() + " , " + Arrays.toString(method.getParameterTypes()));
//        }
        System.out.println("==========================================");
//        for (Field field : fields) {
//            System.out.println(field.getName() + " , " + field.getType());
//        }

        Annotation[] annotations = personClass.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println("YES!");
            }
            System.out.println(Arrays.toString(annotations));
        }

    }
}