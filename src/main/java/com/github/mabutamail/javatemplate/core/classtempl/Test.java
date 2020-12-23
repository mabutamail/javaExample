package com.github.mabutamail.javatemplate.core.classtempl;

public class Test {

    public static void main(String[] args) {

        //  создаем экземпляр - наследник абстрактного класса - он же анонимный
        AbstractClass abstractClassImpl = new AbstractClass(){
            @Override
            public void abstractMethod() {
                System.out.println("Запускаем реализацию абстрактного метода в наследнике");
            }
        };
        abstractClassImpl.abstractMethod();
        abstractClassImpl.method();
        abstractClassImpl.setI(55);
        System.out.println("поле реализации абстрактного класса " + abstractClassImpl.getI());

        //  экземпляр анонимного класс на интерфейсе
        Speak anonClassOnInterface = new Speak() {
            @Override
            public void speak() {
                System.out.println("Анонимный класс на интерфейсе");
            }
        };

        System.out.println(anonClassOnInterface.getClass());
        anonClassOnInterface.speak();

        //  обычный экземпляр класса
        SomeClass temp = new SomeClass("Name", 21);
        System.out.println("temp name " + temp.getName() + " age " + temp.getAge());
        temp.setName("Варфоломей");
        temp.setAge(33);
        temp.speak();
        System.out.println("temp name " + temp.getName() + " age " + temp.getAge());
    }
}