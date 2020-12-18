package com.github.mabutamail.javatemplate.core.classtempl;

//  имплементирует интерфейс
class SomeClass implements Speak {
    //  поля
    private String name;
    private int age;
    //  конструктор пустой
    public SomeClass() {
    }
    //  конструктор с параметрами
    public SomeClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //  метод класса
    public void speak() {
        System.out.println("имплементируем метод speak интерфейса Speak");
    }

    //   геттеры и сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}