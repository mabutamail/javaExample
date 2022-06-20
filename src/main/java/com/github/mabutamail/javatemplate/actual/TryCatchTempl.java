package com.github.mabutamail.javatemplate.actual;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TryCatchTempl {
    public static void main(String[] args) {
        String m = "message";
        try {
            log.info(m);
            m = "TRY";
            log.info(m);
            throw new ArithmeticException(m);
        } catch (Exception e) {
            log.error("", e);
            m = "CATCH";
            log.error(m);
        }
    }
}