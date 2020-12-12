package com.javarush.task.task19.task1907;

import java.io.*;
import java.util.Arrays;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        BufferedReader fileReader = new BufferedReader(new FileReader(bufferedReader.readLine()));
        int c;
        StringBuilder stringBuilder = new StringBuilder();
        while ((c = fileReader.read()) != -1) {
            stringBuilder.append((char) c);
        }
        String[] stringArray = stringBuilder.toString().split("\\W");
        int count = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].trim().trim()
                    .equals("world")) count++;
        }
        System.out.println(count);

        bufferedReader.close();
        fileReader.close();
    }
}
