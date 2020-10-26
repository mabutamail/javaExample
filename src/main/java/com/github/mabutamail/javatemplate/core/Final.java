package com.github.mabutamail.javatemplate.core;

//в классе - не наследуется
//в методе - не переопределяется
//в поле - нельзя изменить
public final class Final {
    private static final int I = 1;

    public static void main(String[] args) {
//        I++;    //  Error
        metod();
        System.out.println(I);

    }

    public static final void metod() {      //???
        System.out.println("метод запущен");
    }

}

//class Class extends Final { //  Error
//
//}