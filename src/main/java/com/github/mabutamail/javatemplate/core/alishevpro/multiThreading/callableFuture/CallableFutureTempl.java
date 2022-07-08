package com.github.mabutamail.javatemplate.core.alishevpro.multiThreading.callableFuture;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.*;

@Slf4j
public class CallableFutureTempl {
    private static int result = 5;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Runnable() {
            @Override
            public void run() { //  нельзя вернуть значение
                log.info("Start thread Runnable");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                result++;
                log.info("Stop thread Runnable");
//                return 5; //
            }
        });

        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                log.info("Start thread Callable");
                Random random = new Random();
                return random.nextInt(100);
            }
        });

        Future<Integer> futureLambda = executorService.submit(() -> {
            log.info("Start thread Lambda");
            Random random = new Random();
            int randomValue = random.nextInt(1000);
            if (randomValue < 500) {
                throw new Exception("Что то случилось");
            }
            return randomValue;
        });

        executorService.shutdown();

        int resultCallable = 0;
        int resultCallableLambda = 0;

        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
            resultCallable = future.get();  //  get дожидается окончания выполнения потока
            resultCallableLambda = futureLambda.get();
        } catch (InterruptedException | ExecutionException e) {
            Throwable throwable = e.getCause();
            log.error(throwable.getMessage());
//            e.printStackTrace();
        }

        log.info("result Runnable\t\t" + result);
        log.info("result Callable\t\t" + resultCallable);
        log.info("result Callable lambda\t" + resultCallableLambda);

    }
}