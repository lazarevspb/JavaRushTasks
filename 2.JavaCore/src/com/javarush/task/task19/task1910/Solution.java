package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            String input = bufferedReader.readLine();
            String output = bufferedReader.readLine();
//            String input = "file0";
//            String output = "file1";
            try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
                    int c;
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((c = reader.read()) != -1) {
                        stringBuilder.append((char) c);
//                        System.out.print((char)c);
                    }
//                    System.out.println(stringBuilder.toString().replaceAll("\\W", ""));
                    writer.write(stringBuilder.toString().replaceAll("[^ a-zA-Z0-9_]", ""));
                }
            }
        }
    }
}
