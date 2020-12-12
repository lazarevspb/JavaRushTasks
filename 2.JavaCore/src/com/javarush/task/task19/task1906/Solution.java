package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
                FileReader reader = new FileReader(bufferedReader.readLine());) {
            FileWriter writer = new FileWriter(bufferedReader.readLine());

            int c;
            StringBuilder stringBuilder = new StringBuilder();

            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
            char[] chars = stringBuilder.toString().toCharArray();
            stringBuilder.setLength(0);
            System.out.println(Arrays.toString(chars));

            for (int i = 0; i < chars.length; i++) {
                if (i % 2 != 0) {
                    stringBuilder.append(chars[i]);
                }
            }
            writer.write(stringBuilder.toString());
            writer.close();
        }
    }
}
