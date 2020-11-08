package com.javarush.task.task18.task1802;

import java.io.*;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
          File file = new File(bufferedReader.readLine());
            int min = 0;
          try (FileInputStream fileInputStream = new FileInputStream(file)) {

              if(fileInputStream.available() > 0) {
                   min = fileInputStream.read();
              }

              while(fileInputStream.available() > 0){
                  int data = fileInputStream.read();
                if(min > data) min = data;
            }
          }
            System.out.println(min);
        }
    }
}
