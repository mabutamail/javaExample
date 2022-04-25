package com.github.mabutamail.javatemplate.core.alishevpro.junitTest;

public class NetworkUtils {
    public static void getConnection() {
        //  получаем соединение с сервером
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}