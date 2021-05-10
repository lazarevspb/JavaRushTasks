package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String filenameInput = args[0];
        String filenameOutput = args[1];

        Charset w1251Ch = Charset.forName("WINDOWS-1251");
        Charset utf8Ch = StandardCharsets.UTF_8;

        byte[] bytes;
        try (FileInputStream fileInputStream = new FileInputStream(filenameInput);
             FileOutputStream fileOutputStream = new FileOutputStream(filenameOutput)) {

            bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            String input = new String(bytes, w1251Ch);
            fileOutputStream.write(input.getBytes(utf8Ch));
        }
    }
}
