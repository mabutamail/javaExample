package com.github.mabutamail.javatemplate.core.interfaces;

//import com.github.mabutamail.javatemplate.core.interfaces.pac1.Class1;
import com.github.mabutamail.javatemplate.core.interfaces.pac2.Class1;

public class Test {
    public static void main(String[] args) {
        InterfaceTempl  class1   = new Class1("name1");
        Class1          class3   = new Class1("name3");
        InterfaceTempl  class2   = new com.github.mabutamail.javatemplate.core.interfaces.pac1.Class1("name2");

        class1.info();      //мы НЕ можем обратиться к методу инфо1!!!
        class2.info();      //мы НЕ можем обратиться к методу инфо1!!!
        class3.info();
        class3.info1();     //МОЖЕМ обратиться к методу инфо1!!!

        System.out.println("При одинаковых именах классов путь одного из них придется прописывать полностью!");
        System.out.println("При создании экземпляра через интерфейс доступа к собственным методам класса НЕ БУДЕТ!");
    }
}