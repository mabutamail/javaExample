package com.github.mabutamail.javatemplate.actual.iterateFilesInFolder;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Objects;

@Slf4j
public class Test {

    public static void main(String... args) {
        //  путь к папке
        File dir = new File("src\\main\\java\\com\\github\\mabutamail\\javatemplate" +
                "\\actual\\iterateFilesInFolder\\tempFiles");

        //  перебираем файлы в непустой папке
        for (File file : Objects.requireNonNull(dir.listFiles())) {
            if (file.isDirectory()) {
                //  если в папке не файл а вложенная папка - выводим имя
                System.out.println("Directory: " + file.getName());
            } else {
                //  если файл - выводим его имя
                System.out.println("File: " + file.getName());
//                file.delete();
            }
        }

        getFilesByMask(String.valueOf(dir), "1.txt");
    }

    public static String[] getFilesByMask(String directory, String mask) {
        String[] result = null;
        if (directory != null) {
            final File dir = new File(directory);
            if (dir.isDirectory()) {
                FilenameFilter file = (File f, String name) -> name.matches(mask);
                result = dir.list(file);
                System.out.println(Arrays.toString(result));
            }
        }
        return result;
    }

//    public static void showFiles(File[] files) {
//        for (File file : files) {
//            if (file.isDirectory()) {
//                System.out.println("Directory: " + file.getName());
//                showFiles(Objects.requireNonNull(file.listFiles())); // Calls same method again.
//            } else {
//                System.out.println("File: " + file.getName());
//                file.delete();
//            }
//        }
//    }
}
