package com.github.mabutamail.javatemplate.date;

import java.time.*;
import java.util.Date;

public class DateTempl {
    public static void main(String[] args) {
//        текущие дата и время с таймзоной
        Date date = new Date();
        System.out.println("Date date \t\t\t" + date);

//        текущая дата без таймзоны
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate \t\t\t" + localDate);

//        текущее время без таймзоны (время в миллисекундах с 1970 года)
        Instant instant = Instant.now();
        System.out.println("instant \t\t\t" + instant);

        // TODO: date -> начало дня
        // TODO: (1) dateToLocalDate
        System.out.println("================= dateToLocalDate ===================");
        LocalDate dateToLocalDate = LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println("dateToLocalDate \t" + dateToLocalDate);

        // TODO: (2) dateToInstant
        System.out.println("================= dateToInstant ===================");
        Instant dateToInstant = date.toInstant();
        System.out.println("dateToInstant \t\t" + dateToInstant);

        // TODO: (3) Instant -> LocalDateTime Convert instant to LocalDateTime, no timezone, add a zero offset / UTC+0
        System.out.println("================= instantToLocalDateTime ===================");
        LocalDateTime ldt = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
        System.out.println("instantToLocalDateTime \t" + ldt);


    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }
}
