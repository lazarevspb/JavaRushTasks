package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
           while(true) {
            String fileName = bufferedReader.readLine();
               try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

                   if (fileInputStream.available() < 1000) {
                       throw new DownloadException();
                   }
               }
           }
        }
    }

    public static class DownloadException extends Exception {
    }
}
