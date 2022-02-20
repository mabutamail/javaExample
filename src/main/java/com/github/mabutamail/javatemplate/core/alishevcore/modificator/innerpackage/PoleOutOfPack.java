package com.github.mabutamail.javatemplate.core.alishevcore.modificator.innerpackage;

import com.github.mabutamail.javatemplate.core.alishevcore.modificator.PoleInClass;

public class PoleOutOfPack extends PoleInClass {
    public static void main(String[] args) {
//        System.out.println(pole_private);                 //только внутри класса
//        System.out.println(Test.pole_default);            //+внутри пакета
        System.out.println(PoleInClass.pole_protected);     //+наследники
        System.out.println(PoleInClass.pole_public);        //всем
    }
}
