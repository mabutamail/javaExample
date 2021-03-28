package com.github.mabutamail.javatemplate.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void joinArray() {
    }

    @Test
    void toArray() {
        String[] expected = {"T", "E", "S", "T"};
        String source="T:E:S:T";
        Assertions.assertArrayEquals(expected, StringUtils.toArray(source, ':'), "Wrong array");
        Assertions.assertEquals(0,StringUtils.toArray(null, ':').length);
    }

    @Test
    void isEmpty() {
        Assertions.assertFalse(StringUtils.isEmpty("TEST"), "Non empty string claimed to be empty");
        Assertions.assertTrue(StringUtils.isEmpty(""), "Empty string not recognized");
        Assertions.assertTrue(StringUtils.isEmpty(" "), "Whitespaces not recognized");
    }

    @Test
    void toDouble() {
        Assertions.assertEquals(3.1415, StringUtils.toDouble("3.1415"), 0.0001);
        Assertions.assertEquals(Double.NaN, StringUtils.toDouble(null), 0.00001, "Not NaN for null");
    }

    @Test
    void fromDouble() {
        double source = 3.1415;
        String expected = "3.1415";

        String actual = StringUtils.fromDouble(source);
        Assertions.assertEquals( expected, actual);
    }

}