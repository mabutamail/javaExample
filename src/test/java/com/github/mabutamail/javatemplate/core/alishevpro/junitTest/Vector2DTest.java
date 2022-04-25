package com.github.mabutamail.javatemplate.core.alishevpro.junitTest;

import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v1 = new Vector2D();   //  action
        //  assertion
        Assert.assertEquals(0, v1.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v1 = new Vector2D();   //  action
        v1.setX(0);
        v1.setY(2);
        //  assertion
        Assert.assertEquals(Math.sqrt(4), v1.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D v1 = new Vector2D();   //  action
        //  assertion
        Assert.assertEquals(0, v1.getY(), 1e-9);
    }

}