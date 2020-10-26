package com.github.mabutamail.javatemplate.core;

public class AccessModifiers {                  //public    default

    private     static int iPrivate     = 1;    //внутри класса
                static int iDefault     = 2;    //+внутри пакета default
    protected   static int iProtected   = 3;    //+наследники
    public      static int iPublic      = 4;    //всем

    public static void main(String[] args) {
        System.out.println(iPrivate);
        System.out.println(iDefault);
        System.out.println(iProtected);
        System.out.println(iPublic);
    }
}

class SomeClass {
    public void method() {
//        System.out.println(AccessModifiers.iPrivate); //ERROR
        System.out.println(AccessModifiers.iDefault);
        System.out.println(AccessModifiers.iProtected);
        System.out.println(AccessModifiers.iPublic);
    }
}