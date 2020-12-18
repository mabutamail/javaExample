package com.github.mabutamail.javatemplate.core.polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Dog(); // Upcasting восходящее преобразование
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.eating();
        animal1.eating();           //позднее связывание - вызовется переопределенный метод в Dog
//        animal1.dogMethod();      //метод недоступен!!!

        dog.eating();
        dog.dogMethod();
        System.out.println("=========================");
        test(animal);   //  полиморфизм
        test(animal1);  //  полиморфизм
        test(dog);      //  полиморфизм используя один иетод разные наследники ведут себя по разному
        test(cat);      //  полиморфизм один метод - разное поведение

        System.out.println("=========================");
        if (animal instanceof Dog) {        //  не выполняется!
            ((Dog) animal).dogMethod();
            ((Dog) animal).eating();
        }

//        ((Dog)animal).dogMethod();    // ОШИБКА!

        if (animal1 instanceof Dog) {
            ((Dog) animal1).dogMethod();     // Downcasting нисходящее преобразование
            ((Dog) animal1).eating();        // доступ к родительскому и собственному методу
        }
    }

    public static void test(Animal animal) {
        animal.eating();
    }
}
