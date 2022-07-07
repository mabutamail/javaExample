package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class ThreadInterruptedTempl {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        log.info("Thread is interrupted");
                        break;
                    }
                    Math.sin(random.nextDouble());
                }
            }
        });

        log.info("Thread start");

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
//        thread.stop();
        thread.join();


        log.info("Thread stop");

    }
}