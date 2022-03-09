package com.github.mabutamail.javatemplate.core.alishevcore.enumTempl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum Season {
    WINTER("Зима", -12),
    SPRING("Весна", 5),
    AUTUMN("Осень", 3),
    SUMMER("Лето", 27);
    private final String translation;
    private final int temperature;

//    Season(String translation) {
//        switch (translation) {
//            case WINTER:
//                System.out.println("Зима");
////                log.info("Зима");
//                break;
//            case SPRING:
//                System.out.println("Весна");
////                log.info("Весна");
//                break;
//            case AUTUMN:
//                System.out.println("Лето");
////                log.info("Лето");
//                break;
//        }
//    }

    Season(String translation, int temperature) {
        this.translation = translation;
        this.temperature = temperature;
    }

    public String getTranslation() {
        return translation;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Season{" +
                "translation='" + translation + '\'' + " средняя температура " + temperature +
                '}';
    }
}