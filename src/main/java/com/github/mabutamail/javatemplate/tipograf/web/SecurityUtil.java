package com.github.mabutamail.javatemplate.tipograf.web;

import static com.github.mabutamail.javatemplate.tipograf.util.MealsUtil.DEFAULT_CALORIES_PER_DAY;

public class SecurityUtil {

    public static int authUserId() {
        return 1;
    }

    public static int authUserCaloriesPerDay() {
        return DEFAULT_CALORIES_PER_DAY;
    }
}