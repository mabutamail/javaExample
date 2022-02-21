package com.github.mabutamail.javatemplate.core.alishevcore.writeFile;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

@Slf4j
public class AppStart {
    public static void main(String[] args) throws FileNotFoundException {
        log.info("Program start\n");
        writeToFile();
        log.info("Program done");
    }
    public static void writeToFile() throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("line 11");
        pw.println("line 22");
        pw.close();
        log.info("File is writing");
    }
}