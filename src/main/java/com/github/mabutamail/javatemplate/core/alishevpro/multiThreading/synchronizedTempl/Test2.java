package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading.synchronizedTempl;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        worker.main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() throws InterruptedException {
        synchronized (lock1) {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() throws InterruptedException {
        synchronized (lock2) {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        }
    }

    public void work() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }

    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                work();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        long after = System.currentTimeMillis();
        System.out.println("Program took\t" + (after - before) + "\tms to run");
        System.out.println("List1 :\t" + list1.size());
        System.out.println("List2 :\t" + list2.size());
    }
}