package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        String input = "";
        List<String> strings = new ArrayList<>();
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            while (true) {
                input = bufferedReader.readLine();
                if (input.equals("exit")) break;
                strings.add(input);
            }
            List<Thread> threadsList = new ArrayList<>();

            for (int i = 0; i < strings.size(); i++) {
                threadsList.add(new ReadThread(strings.get(i)));
                threadsList.get(i).start();
            }
        }
    }

    public static class ReadThread extends Thread {
        Map<Character, Integer> charMap = new HashMap<>();
        String fileName;
        int[] chars = new int[128];

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            File file = new File(fileName);
            try (FileInputStream inputStream = new FileInputStream(file)) {
                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                    chars[data]++;
                }

                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] != 0) {
                        charMap.put((char) i, chars[i]);
                    }
                }
                Map.Entry<Character, Integer> maxEntry =
                        Collections.max(charMap.entrySet(), Map.Entry.comparingByValue());
                resultMap.put(fileName, (int) maxEntry.getKey());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
