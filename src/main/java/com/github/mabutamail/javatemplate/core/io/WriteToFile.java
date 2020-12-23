package com.github.mabutamail.javatemplate.core.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "test";
        File file = new File(path);

        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("пишем в файл");
        printWriter.println("Записано в файл " + LocalDateTime.now());

        printWriter.close();
        System.out.println("Записано в файл " + LocalDateTime.now());
    }
}