package com.github.mabutamail.javatemplate.actual.iterateFilesInFolder;

import java.io.File;
import java.util.Objects;

public class Test {

    public static void main(String... args) {
        File dir = new File("src/main/java/com/github/mabutamail/javatemplate/actual/iterateFilesInFolder/tempFiles");
        showFiles(Objects.requireNonNull(dir.listFiles()));
    }

    public static void showFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                showFiles(Objects.requireNonNull(file.listFiles())); // Calls same method again.
            } else {
                System.out.println("File: " + file.getName());
                file.delete();
            }
        }
    }
}
