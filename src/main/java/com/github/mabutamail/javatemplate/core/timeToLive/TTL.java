package com.github.mabutamail.javatemplate.core.timeToLive;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Slf4j
public class TTL {
    public static void main(String[] args) throws InterruptedException {
        int ttl = 3;    //  время жизни запроса в секундах (2 часа 7200=60*60*2)
        long interval;

        //  запрос пришел
        Instant timeStart = Instant.now();    //  наносекунды 10 -9

        log.info("запрос пришел в наносекундах " + timeStart);
        //  что-то происходит...



        TimeUnit.SECONDS.sleep(2);
        //  время на текущий момент
        Instant timeEnd = Instant.now();
        log.info("время на текущий момент в наносекундах " + timeEnd);
        log.info("timeEnd.getEpochSecond() \t\t" + timeEnd.getEpochSecond());
        log.info("timeStart.getEpochSecond() \t" + timeStart.getEpochSecond());
        interval = timeEnd.getEpochSecond() - timeStart.getEpochSecond();

        log.info("запрос создан " + interval + " секунд назад");
    }
}