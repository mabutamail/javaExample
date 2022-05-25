package com.github.mabutamail.javatemplate.actual.fileDelete;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Slf4j
public class FileDelete {
    // Paths Path Files
    public static void main(String[] args) throws IOException, InterruptedException {
//        Path path = Paths.get("src/main/java/com/github/mabutamail/javatemplate/actual/fileDelete/" + "1.txt").toAbsolutePath();
//        System.out.println("getFileName \t\t"   + path.getFileName());
//        System.out.println("getFileSystem \t\t" + path.getFileSystem());
//        System.out.println("getName \t\t\t"     + path.getName(8));
//        System.out.println("getParent \t\t\t"   + path.getParent());
//        System.out.println("getRoot \t\t\t"     + path.getRoot());
//        System.out.println("isAbsolute \t\t\t"  + path.isAbsolute());
//
//        if (!Files.exists(path)) {
//            Files.createFile(path);
//            System.out.println("Создан");
//            Files.copy(Paths.get(path + "1.txt"), Paths.get("2.txt"));
//        }

        Path p1 = Paths.get("src\\main\\java\\com\\github\\mabutamail\\javatemplate\\actual\\fileDelete\\testfile.msg");
//        Files.createDirectories(p1);
//        log.error("dir created " + p1);
        if (!Files.exists(p1)) {
            Files.createFile(p1);
            log.error("file created \n" + p1);
        }
        Files.delete(p1);
        log.error("file delete \n" + p1);

        //  удалить все файлы из папки temp
        Path dir = Paths.get("src/main/java/com/github/mabutamail/javatemplate/actual/fileDelete/temp");

    }

}