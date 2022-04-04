package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Thread {
    public static void main(String[] args) throws InterruptedException {
        java.lang.Thread thread = new java.lang.Thread(new Runnable());
        thread.start();
//        Runnable runnable = new Runnable();
//        runnable.run();
        for (int i = 0; i < 1; i++) {
            log.info("====================================================== Hello world from main " + i);
        }
        java.lang.Thread.sleep(2000);
        log.info("====================================================== END main ");

//        MyThread multi = new MyThread();
//        MyThread multi1 = new MyThread();
//        multi.start();
//        multi1.start();
//
//        log.info("=============================== Im sleep ===============================");
//        Thread.sleep(2 * 1000);
//        log.info("=============================== Im awake ===============================");
//
//        for (int i = 0; i < 50; i++) {
//            log.error("Hello world " + i);
//        }
    }
}


@Slf4j
class Runnable implements java.lang.Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            log.error("Hello world from thread!!! " + i);
        }
    }
}


@Slf4j
class MyThread extends java.lang.Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            log.info("Hello world from thread!!! " + i);
        }
    }
}