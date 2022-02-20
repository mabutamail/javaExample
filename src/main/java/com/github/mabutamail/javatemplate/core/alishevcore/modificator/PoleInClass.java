package com.github.mabutamail.javatemplate.core.alishevcore.modificator;

public class PoleInClass {
    private     static  String  pole_private    = "pole_private";       //только внутри класса
                static  String  pole_default    = "pole_default";       //+внутри пакета
    protected   static  String  pole_protected  = "pole_protected";     //+наследники
    public      static  String  pole_public     = "pole_public";        //всем

    public static void main(String[] args) {
        System.out.println(pole_private);
        System.out.println(pole_default);
        System.out.println(pole_protected);
        System.out.println(pole_public);
    }
}
class PoleOutOfClass {
    public static void main(String[] args) {
//        System.out.println(pole_private);                 //только внутри класса
        System.out.println(PoleInClass.pole_default);       //+внутри пакета
        System.out.println(PoleInClass.pole_protected);     //+наследники
        System.out.println(PoleInClass.pole_public);        //всем
    }
}