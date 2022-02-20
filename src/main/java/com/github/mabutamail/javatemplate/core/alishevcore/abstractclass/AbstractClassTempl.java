package com.github.mabutamail.javatemplate.core.alishevcore.abstractclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@AllArgsConstructor
// @Data - генерирует конструктор, геттеры, сеттеры, методы equals, hashCode,
// toString. А также делает все поля private.
public abstract class AbstractClassTempl {
    String name;
    int age;

    abstract void abstractMethod();

    public static void main(String[] args) {
        log.info("Program start");
//        log.error("error");
//        log.warn("warn");
//        System.out.println(log.isInfoEnabled());
//        log.info("info");
//        log.debug("debug");
//        log.trace("trace");
//        System.out.println("========================");
//        System.out.println(log.isErrorEnabled());
//        System.out.println(log.isWarnEnabled());
//        System.out.println(log.isInfoEnabled());
//        System.out.println(log.isDebugEnabled());
//        System.out.println(log.isTraceEnabled());
//        System.out.println("qwer");
    }
}