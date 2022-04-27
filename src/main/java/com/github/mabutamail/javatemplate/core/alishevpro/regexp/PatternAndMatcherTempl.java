package com.github.mabutamail.javatemplate.core.alishevpro.regexp;

import lombok.extern.slf4j.Slf4j;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class PatternAndMatcherTempl {
    public static void main(String[] args) {
        String text = "Hello Guys! I send you my email joe@gmail.com so we can\n" +
                "my address tim@yandex.ru. Let's stay in touch...";

        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find()) {
            System.out.print(matcher.group() + "\t");
            System.out.print(matcher.group(1) + "\t\t");
            System.out.print(matcher.group(2) + "\t");
            System.out.println(matcher.group(3));
        }
    }
}