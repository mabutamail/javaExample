package com.github.mabutamail.javatemplate.core.timeToLive;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;


@Slf4j
public class TTL {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Контейнер для хранения сообщений и ключей для доступа
         */
        TreeMap<Integer, String> messagesToFront_;
        messagesToFront_ = new TreeMap<>();
        int ttl = 3;    //  время жизни запроса в секундах (2 часа 7200=60*60*2)
        long interval;

        //  запрос пришел
        Instant timeStart = Instant.now();    //  наносекунды 10 -9

        log.info("запрос пришел в наносекундах " + timeStart);
        //  что-то происходит...
        //  пришли запросы
        Query query1 = new Query("query1");
        TimeUnit.SECONDS.sleep(1);
        Query query2 = new Query("query2");
        TimeUnit.SECONDS.sleep(1);
        Query query3 = new Query("query3");
//        log.info(query1.toString());
//        log.info(query2.toString());
//        log.info(query3.toString());

        messagesToFront_.put(11, query1.toString());
        messagesToFront_.put(21, query2.toString());
        messagesToFront_.put(33, query3.toString());

        log.info("все запросы с фронта: \n" + messagesToFront_);


        for (Integer key : messagesToFront_.keySet()) {
            log.info("22222222222222  " + messagesToFront_.get(key));
//            messagesToFront_.remove(21);
//            System.out.println("Key: " + key + ", Value: " + messagesToFront_.get(key));
        }

        messagesToFront_.remove(21);
        log.info("все запросы с фронта2: \n" + messagesToFront_);

        //  время на текущий момент
//        Instant timeEnd = Instant.now();
//        log.info("время на текущий момент в наносекундах " + timeEnd);
//        log.info("timeEnd.getEpochSecond() \t\t" + timeEnd.getEpochSecond());
//        log.info("timeStart.getEpochSecond() \t" + timeStart.getEpochSecond());
//        interval = timeEnd.getEpochSecond() - timeStart.getEpochSecond();
//
//        log.info("запрос создан " + interval + " секунд назад");
    }
}