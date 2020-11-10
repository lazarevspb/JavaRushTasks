package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));) {
          String fileName0 = bufferedReader.readLine();
          String fileName1 = bufferedReader.readLine();

          try (FileInputStream fileInputStream = new FileInputStream(fileName0);
          FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
              byte[] buffer = new byte[fileInputStream.available()];

              while (fileInputStream.available() > 0 ){
                  int count = fileInputStream.read(buffer);

              for (int i = 0; i < buffer.length/2; i++) {  // переворачивает массив
                  byte tmp = buffer[i];
                  buffer[i] = buffer[buffer.length - i - 1];
                  buffer[buffer.length - i -1] = tmp;
              }
                  fileOutputStream.write(buffer, 0, count);
              }
          }
        }
    }
}
