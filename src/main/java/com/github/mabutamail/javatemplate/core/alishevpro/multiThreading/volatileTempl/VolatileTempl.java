package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading.volatileTempl;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class VolatileTempl {
//    public static int i;
    public static void main(String[] args) throws InterruptedException {
        log.info("Program start ");
        MyThread thread = new MyThread();
        thread.start();
//        Thread.sleep(3 * 1000);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        thread.shutdown();
        log.info("thread.shutdown(); ");
//        log.info("MyThread.running= " + VolatileTempl.i);
//        for (int j = 0; j < 10; j++) {
//            log.info("Hello from main " + VolatileTempl.i++);
//        }
    }
}

@Slf4j
class MyThread extends java.lang.Thread {
    private volatile boolean running = true;    //  volatile используем общиую память для всех потоков, а не кеши ядер
    @Override
    public void run() {
        while (running) {
//            log.error("Hello from thread ");
            System.out.println("Hello from thread ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        for (int i = 0; i < 10; i++) {
//            log.error("Hello from thread " + VolatileTempl.i++);
//        }
    }

    public void shutdown() {
        this.running = false;
    }

}