package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        String sourceFileName0, targetFilename1;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            sourceFileName0 = bufferedReader.readLine().trim();
            targetFilename1 = bufferedReader.readLine().trim();

            try (FileInputStream fileInputStream0 = new FileInputStream(sourceFileName0);
                 FileInputStream fileInputStream1 = new FileInputStream(targetFilename1);
            ) {


                byte[] file1 = new byte[fileInputStream0.available()];
                while (fileInputStream0.available() > 0) {
                    fileInputStream0.read(file1);
                }

                byte[] file2 = new byte[fileInputStream1.available()];
                while (fileInputStream1.available() > 0) {
                    fileInputStream1.read(file2);
                }

                FileOutputStream fileOutputStream = new FileOutputStream(sourceFileName0);
                fileOutputStream.write(file2);
                fileOutputStream.write(file1);
                fileOutputStream.close();
            }
        }
    }
}
