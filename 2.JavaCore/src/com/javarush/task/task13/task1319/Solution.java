package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String outputFileName = reader.readLine().trim();
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
        String line;
        while (true) {
            line = reader.readLine();
            if(line.equals("exit")){
                writer.write(line);
                break;
            }
            writer.write(line + "\n");
        }
        writer.close();
    }
}

/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destinationFileName = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName));

        StringBuilder builder = new StringBuilder();

        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }

        writer.write(builder.toString());
        writer.close();

        */