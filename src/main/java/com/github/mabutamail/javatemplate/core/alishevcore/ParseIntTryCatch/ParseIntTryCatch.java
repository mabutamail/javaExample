package com.github.mabutamail.javatemplate.core.alishevcore.ParseIntTryCatch;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParseIntTryCatch {
    public static void main(String[] args) {
        String s = "12s";
        int i = 0;
        try {
            i = Integer.parseInt(s);
            log.info("ParseInt " + i);
        } catch (NumberFormatException e) {
            log.error("Parse int ERROR " + e);
        }
        log.info("Parse result " + i);
    }
}