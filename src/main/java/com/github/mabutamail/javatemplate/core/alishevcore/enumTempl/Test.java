package com.github.mabutamail.javatemplate.core.alishevcore.enumTempl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = 4;
        switch (animal) {
            case DOG:
                log.info("its a DOG");
                break;
            case CAT:
                log.info("its a CAT");
                break;
            case FROG:
                log.info("its a FROG");
                break;
            default:log.info("its not an animal");
        }
        log.info("Program stert " + DOG + " " + CAT + " " + FROG);
    }
}