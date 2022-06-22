package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading.waitAndNotify;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

@Slf4j
class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            log.info("Producer thread started... ");
            wait(); //  1 - отдаем intrinsic lock, 2 - ждем пока будет вызван notify().
            //  wait(1000);
            log.info("Producer thread resumed... ");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            log.info("Waiting for return key...");
            scanner.nextLine();
            notify();
        }
    }
}