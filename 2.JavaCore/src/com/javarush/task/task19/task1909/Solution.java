package com.javarush.task.task19.task1909;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
             BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()))
        ) {

            int c;
            StringBuilder stringBuilder = new StringBuilder();
            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }
        String s = stringBuilder.toString().replaceAll("\\.", "!");
            writer.write(s);
        }
    }
}

