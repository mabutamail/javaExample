package com.github.mabutamail.javatemplate.core.alishevpro.annotation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@MethodInfo(purpose = "Назначение")
public class Test {
    @MethodInfo(author = "Author", dateOfCreation = 2000, purpose = "Назначение")
//    @MethodInfo(purpose = "Назначение")
    public void printHelloWorld() {
        System.out.println("Hello world sout");
        log.info("Hello world log.info");
    }
}