package com.github.mabutamail.javatemplate.core.alishevpro.junitTest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vector2D {
    private double x;
    private double y;

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

}