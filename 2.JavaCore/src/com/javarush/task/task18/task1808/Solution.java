package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] fileNames = new String[3];
        getFileNames(fileNames);

        try (FileInputStream fileInputStream = new FileInputStream(fileNames[0]);
             FileOutputStream fileOutputStream0 = new FileOutputStream(fileNames[1]);
             FileOutputStream fileOutputStream1 = new FileOutputStream(fileNames[2])) {

            byte[] buffer = new byte[fileInputStream.available()];
            if (fileInputStream.available() > 0) {
                int count = fileInputStream.read(buffer);

                if (count % 2 == 0) {
//fileOutputStream0.write("буфер","индекс с которого начинаем запись","количество элементов для записи")
                    fileOutputStream0.write(buffer, 0, count / 2);
                    fileOutputStream1.write(buffer, count / 2, count / 2);
                } else {
                    fileOutputStream0.write(buffer, 0, count / 2 + 1);
                    fileOutputStream1.write(buffer, count / 2 + 1, count / 2);
                }
            }
        }
    }

    protected static void getFileNames(String[] fileNames) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            for (int i = 0; i < 3; i++) {
                fileNames[i] = bufferedReader.readLine();
            }
        }
    }
}
