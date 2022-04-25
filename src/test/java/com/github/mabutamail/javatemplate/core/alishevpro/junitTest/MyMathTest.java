package com.github.mabutamail.javatemplate.core.alishevpro.junitTest;

import org.junit.Test;

public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException() {
        MyMath.divide(1,0);
//        Assert.assertEquals(3, MyMath.divide(6, 0), 1e-9);
//        Assert.fail(1, MyMath.divide(6, 0));
    }
}