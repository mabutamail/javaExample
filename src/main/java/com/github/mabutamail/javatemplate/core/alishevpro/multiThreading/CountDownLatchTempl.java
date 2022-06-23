package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class CountDownLatchTempl {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++) {
            executorService.submit(new Proessor(i, countDownLatch));
        }

        executorService.shutdown();

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown();
        }

//        countDownLatch.await();
//        log.info("Защелка открыта, поток майн запущен");

    }
}

@Slf4j
class Proessor implements java.lang.Runnable {
    private final CountDownLatch countDownLatch;
    private final int id;

    Proessor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        countDownLatch.countDown();
        log.info("Поток с id " + id + " запущен");
    }
}