package com.github.mabutamail.javatemplate.hash;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashTempl {
    private static final Logger LOG = LoggerFactory.getLogger(HashTempl.class);

    public static void main(String[] args) throws FileNotFoundException, NoSuchAlgorithmException {

        // TODO: хеш не совпадает с онлайн чекером https://emn178.github.io/online-tools/sha256_checksum.html
        //        читаем файл   CF3CAD32240AA828AEAB3C26ECEA7C67FDFC67A70B8A109EE473C7471626045C
        //алгоритм хеширования
        MessageDigest md =
                MessageDigest.getInstance("SHA-256");
        try (
                //  входящий поток байт текущего фильма
                BufferedInputStream in =
                        new BufferedInputStream(new FileInputStream("C:\\Users\\HOME\\Desktop\\hash1.mp4"), 2048);
//                DigestInputStream dis =
//                        new DigestInputStream(in, md)
        ) {
            //  считываем все данные из потока в массив
//            byte[] input1 = dis.readAllBytes();
            byte[] input = in.readAllBytes();
            //  получаем hash в виде 32 байтов
            byte[] digest = md.digest(input);
            //  конвертируем bytesToHex
            String hash = DatatypeConverter.printHexBinary(digest);
            System.out.println(hash);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}