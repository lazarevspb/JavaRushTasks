package com.javarush.task.task18.task1825;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

/* 
Собираем файл

file.avi.tx2
file.avi.tx0
file.avi.tx1
end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        readNameFile(list);
        list = sortingFilesByName(list);
        byte[] data = readFiles(list);
        writeFiles(data, getNameFile(list));
    }

    private static String getNameFile(List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).substring(0, list.get(i).lastIndexOf("."));
            result.add(s);
        }
        return result.get(0);
    }

    private static void writeFiles(byte[] data, String filename) throws IOException {
        File file = new File(filename);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file, true)) {
            fileOutputStream.write(data);
        }
    }

    private static byte[] readFiles(List<String> sortNames) throws IOException {
        int count = 0;
        byte[] buffer;
        StringBuilder result = new StringBuilder();
        while (true) {
            try (FileInputStream fileInputStream = new FileInputStream(sortNames.get(count))) {
                buffer = new byte[fileInputStream.available()];
                while (fileInputStream.available() > 0) {
                    fileInputStream.read(buffer);
                }
            }
            result.append(new String(buffer, StandardCharsets.UTF_8));
            count++;
            if (count > sortNames.size() - 1) break;
        }
        return result.toString().getBytes();
    }


    private static List sortingFilesByName(List<String> nameFiles) {
        return nameFiles.stream().sorted(String::compareTo).collect(Collectors.toList());
    }


    private static void readNameFile(List<String> list) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String input = bufferedReader.readLine().trim();
                if (input.equals("end")) break;
                list.add(input);
            }
        }
    }
}
