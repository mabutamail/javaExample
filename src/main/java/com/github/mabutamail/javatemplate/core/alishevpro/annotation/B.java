package com.github.mabutamail.javatemplate.core.alishevpro.annotation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class B extends A {
    @Override
    public void test() {
        log.info("Hello from B");
    }
}