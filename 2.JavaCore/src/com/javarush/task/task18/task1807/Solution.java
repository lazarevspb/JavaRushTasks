package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
          File file = new File(bufferedReader.readLine());
          try (FileInputStream fileInputStream = new FileInputStream(file)) {
              int count = 0;
            while(fileInputStream.available() > 0){
                int data = fileInputStream.read();
                if(data == 44){
                    count++;
                }
            }
                System.out.print(count);
          }
        }



    }
}
