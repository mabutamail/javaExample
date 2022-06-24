package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

@Slf4j
public class SemaphorTempl {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();

        for (int i = 0; i < 200; i++) {
            executorService.submit(() -> {
                try {
                    connection.work();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

//        Semaphore semaphore = new Semaphore(3);
//
//        int i = semaphore.availablePermits();   //  количество оставшихся ресурсов
//        log.info(" " + i);
//        semaphore.acquire();            //  взять ресурс
//        semaphore.acquire();            //  взять ресурс
//        semaphore.acquire();            //  взять ресурс
////        semaphore.acquire();            //  взять ресурс
//        log.info("semaphore.availablePermits()\t" + semaphore.availablePermits());
//        semaphore.release();            //  вернуть ресурс
//        log.info("semaphore.availablePermits()\t" + semaphore.availablePermits());
    }
}

@Slf4j
class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();

        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            log.info("connectionsCount:\t" + connectionsCount++);
        }

        Thread.sleep(1000);

        synchronized (this) {
            connectionsCount--;
        }
    }

}