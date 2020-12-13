package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            try (BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()))) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {
                    int c;
                    StringBuilder sb = new StringBuilder();
                    while ((c = reader.read()) != -1) {
                        sb.append((char) c);
                    }
                    String[] result = sb.toString().split("\\s");
                    sb.setLength(0);
                    for (String s : result) {
                        try {
                            sb.append(Integer.parseInt(s)).append(" ");
                        } catch (NumberFormatException ignored) {
                        }
                    }
                    writer.write(sb.toString());
                }
            }
        }

    }
}


/*
*
*
    String result = bufferedReader.lines()
        .flatMap(s -> Arrays.stream(s.split("\\s+")))
        .filter(s -> s.matches("\\d+"))
        .collect(Collectors.joining(" "));
*
* */