package com.github.mabutamail.javatemplate.core.alishevpro.junitTest;

import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThenOneSecond() {
        NetworkUtils.getConnection();
    }
}