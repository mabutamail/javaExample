package com.github.mabutamail.javatemplate.core.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "test";
//        String path = "src/main/resources/test";
//        String path = "F:/Java/Projects/javaExample/src/main/resources/test";
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }
        System.out.println("Integer " + Arrays.toString(num));

        System.out.println("String " + Arrays.toString(numbers));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }

}