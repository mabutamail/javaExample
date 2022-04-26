package com.github.mabutamail.javatemplate.core.alishevpro.regexp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RegexpTempl {
    public static void main(String[] args) {
        /*
        https://regexlib.com/CheatSheet.aspx
            \\d     - одна цифра
            \\w     - одна английская буква
            \\w = [a-zA-Z]

            +       - один или более
            *       - ноль или более
            ?       - ноль или 1 символ до

            (x|y|z) - одна строка из множества строк

            [a-zA-Z]- все английские буквы
            [0-9] = \\d   - все цифры
            (a|b|c) = [abc]
            [^abc]  - исключаем символы следующие за ^

            .       - любой символ

            {2}     - 2 символа до (\\d{2})
            {2,}    - 2 или более символа до (\\d{2,})
            {2,4}   - от 2  до 4 символов до (\\d{2,4})
         */

        String a = "-1";
        String b = "1";
        String c = "+1";
        log.info("\t\t\t" + a.matches("([-+])?\\d*"));
        log.info("\t\t\t" + b.matches("([-+])?\\d*"));
        log.info("\t\t\t" + c.matches("([-+])?\\d*"));
//        log.info("" + c.matches("(-|\\+)?\\d*"));

        String d = "dfg333dfg123456";
        log.info("[a-zA-Z3]\t" + d.matches("[a-zA-Z3]+\\d*"));

        String e = "hello";
        log.info("^\t\t\t" + e.matches("[^abcd]*"));

        String url = "http://www.google.com";
        String url1 = "http://www.yandex.ru";
        log.info("url\t\t\t" + url.matches("http://www\\..+\\.(com|ru)"));
        log.info("url\t\t\t" + url1.matches("http://www\\..+\\.(com|ru)"));

        String f = "12345";
        log.info("5 цифр\t\t" + f.matches("\\d{5}"));
        log.info("\t\t\t" + f.matches("[a-z0-9]{2,5}"));

    }
}