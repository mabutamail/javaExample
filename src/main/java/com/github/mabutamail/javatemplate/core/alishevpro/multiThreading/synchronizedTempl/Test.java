package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading.synchronizedTempl;


public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        for (int i = 0; i < 10; i++) {
            test.doWork();
        }
    }


    public synchronized void increment() {
        counter++;
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

//        Thread.sleep(1);

        System.out.println("counter\t" + counter);
        counter = 0;
    }

}