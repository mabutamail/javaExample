package com.github.mabutamail.javatemplate.core.alishevcore.enumTempl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test1 {
    public static void main(String[] args) {
//        Animal animal0 = Animal.DOG;
//        Animal animal1 = Animal.CAT;
//        Animal animal2 = Animal.FROG;
//        log.info(animal0 + " " + animal1 + " " + animal2);

        Season season = Season.WINTER;
        log.info("" + (season instanceof Enum));
        log.info(season.getClass() + "");
        switch (season) {
            case SPRING:
                log.info("это веснаа!!");
                break;
            case SUMMER:
                log.info("жара!");
                break;
            default:
                log.info("что-то непонятное");
        }
//        log.info(season.getTranslation());
//        log.info("" + season);
//        System.out.println(season);
//        log.info("" + season.getTemperature());
        log.info("метод ENUM name " + season.name());
        log.info("метод ENUM valueof " + season.valueOf("WINTER"));
        log.info("метод ENUM ordinal " + season.ordinal());

//        switch (animal0) {
//            case CAT:
//                log.info("its a CAT");
//                break;
//            case DOG:
//                log.info("its a DOG");
//                break;
//            default:
//                log.info("its not an animal");
//        }
    }
}