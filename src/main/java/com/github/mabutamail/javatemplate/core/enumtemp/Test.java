package com.github.mabutamail.javatemplate.core.enumtemp;

public class Test {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;

        System.out.println(Season.AUTUMN.ordinal());
        System.out.println(season.getTranslation());
        Season asd = Season.valueOf("WINTER");
        System.out.println(asd.getTranslation());
        System.out.println(Season.AUTUMN);
        System.out.println(Season.AUTUMN.name());
        System.out.println(Season.AUTUMN.getTranslation());
        System.out.println(Season.AUTUMN.getClass());
        System.out.println(Season.SPRING.toString());
    }
}