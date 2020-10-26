package com.github.mabutamail.javatemplate.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyFirstJUnitJupiterTests {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    void minus() {
        assertEquals(3, calculator.minus(4, 1));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(33, 11));
    }

}