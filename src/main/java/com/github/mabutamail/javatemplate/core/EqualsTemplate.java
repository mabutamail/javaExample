package com.github.mabutamail.javatemplate.core;

public class EqualsTemplate {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        //        сравниваем примитивы
        System.out.println("сравниваем примитивы == " + (i == j));

        //        сравниваем объекты
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println("сравниваем объекты == " + (animal1 == animal2));
        //      по умолчанию Object.equals (==), сравнивает ссылки у экземпляров класса
        System.out.println("сравниваем объекты equals " + (animal1.equals(animal2)));
        Animal animal3 = animal1;
        System.out.println("сравниваем объекты по ссылке == " + (animal3 == animal1));

        //        сравниваем строки
        String s1 = "name";
        String s2 = "name";
        String s3 = new String("name"); //  String pool!!!
        System.out.println("сравниваем строки == " + (s1 == s2));
        System.out.println("сравниваем строки созданные с помощью new == " + (s1 == s3));
        System.out.println("сравниваем строки equals " + (s1.equals(s2)));
        System.out.println("сравниваем строки  созданные с помощью new equals " + (s1.equals(s3)));

    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
//      переопределяем Object.equals (==), сравнивая поля
    public boolean equals(Object o) {
        return this.id == ((Animal) o).id;
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return id == animal.id;
    }
//    @Override
//    public int hashCode() {
//        return id;
//    }
}