package com.github.mabutamail.javatemplate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyTempl {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/main/resources/application.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("PROPERTY_1"));
        System.out.println(properties.getProperty("PROPERTY_2"));
        System.out.println(properties.getProperty("ip"));
        System.out.println(properties.getProperty("port"));
    }
}