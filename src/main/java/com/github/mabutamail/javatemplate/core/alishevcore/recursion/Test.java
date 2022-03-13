package com.github.mabutamail.javatemplate.core.alishevcore.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static long result = 0;

    public static void main(String[] args) {
        int f = 20;
        log.info("result " + f + "!= " + fac(f));
//        counter(5290);
    }

    //    15! факториал 3!=3*2*1=6  4!=4*3*2=24 5!=120
    private static long fac(int n) {
        if (n == 1) return 1;
        result = n * fac(n - 1);
        log.info(n + "!=" + result + "\n");
        return result;
    }

    public static void counter(int n) {
        if (n == 0) return;
        log.info("recursion " + n + "\n");
        counter(n - 1);
    }
}