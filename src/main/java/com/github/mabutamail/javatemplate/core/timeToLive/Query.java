package com.github.mabutamail.javatemplate.core.timeToLive;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

@Slf4j
@Data   //  @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields,
        // and @RequiredArgsConstructor
public class Query {
    static int count = 1;
    int id;
    Instant timeStart;
    String query;

    public Query(String query) {
        this.id = count++;
        this.timeStart = Instant.now();
        this.query = query;
    }

    public static void main(String[] args) throws InterruptedException {
        Query query1 = new Query("query1");
        TimeUnit.SECONDS.sleep(2);
        Query query2 = new Query("query2");
        Query query3 = new Query("query3");
        log.info(query1.toString());
        log.info(query2.toString());
        log.info(query3.toString());
    }
}