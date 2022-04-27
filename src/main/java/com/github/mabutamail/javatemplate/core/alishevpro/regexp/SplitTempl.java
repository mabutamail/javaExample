package com.github.mabutamail.javatemplate.core.alishevpro.regexp;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class SplitTempl {
    public static void main(String[] args) {
        String s = "Hello there hey";
        String s1 = "Hello.there.hey";
        String s2 = "Hello4342there6767hey";

        String[] arr = s.split(" ");
        log.info("" + Arrays.toString(arr));

        String[] arr1 = s1.split("\\.");
        log.info("" + Arrays.toString(arr1));

        String[] arr2 = s2.split("\\d+");
        log.info("" + Arrays.toString(arr2));

        String modString = s.replace(" ", "%%%");
        log.info("" + modString);
        String modString1 = s.replaceAll(" ", "===");
        log.info("" + modString1);
        String modString2 = s.replaceFirst(" ", "++++++");
        log.info("" + modString2);
    }
}