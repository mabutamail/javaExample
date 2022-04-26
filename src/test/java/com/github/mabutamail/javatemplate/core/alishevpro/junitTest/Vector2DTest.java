package com.github.mabutamail.javatemplate.core.alishevpro.junitTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Vector2DTest {

    private static final double DELTA = 1e-9;
    private static Vector2D v1;

    @Before
    public void createNewVector() {
         v1 = new Vector2D();   //  action
    }

    @Test
    public void newVectorShouldHaveZeroLength() {
//        Vector2D v1 = new Vector2D();   //  action
        //  assertion
        Assert.assertEquals(0, v1.length(), DELTA);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
//        Vector2D v1 = new Vector2D();   //  action
        v1.setX(0);
        v1.setY(2);
        //  assertion
        Assert.assertEquals(Math.sqrt(4), v1.length(), DELTA);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
//        Vector2D v1 = new Vector2D();   //  action
        //  assertion
        Assert.assertEquals(0, v1.getY(), DELTA);
    }

}