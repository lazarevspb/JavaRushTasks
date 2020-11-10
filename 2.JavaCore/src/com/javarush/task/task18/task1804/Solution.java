package com.javarush.task.task18.task1804;


import java.io.*;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();

        fillMap(map);
        Map.Entry<Integer, Integer> minValue = getMinEntry(map);
        filterAndPrintMap(map, minValue);

    }

    protected static void filterAndPrintMap(Map<Integer, Integer> map, Map.Entry<Integer, Integer> minValue) {
        map.entrySet()  //фильтрация map и вывод в консоль stream api
                .stream()
                .filter(entry -> entry
                        .getValue()
                        .equals(minValue.getValue()))
                .forEach(entry1 ->
                        System.out.print(entry1.getKey() + " "));
    }

    protected static Map.Entry<Integer, Integer> getMinEntry(Map<Integer, Integer> map) {
        //Поиск минимального значения в map.
        Map.Entry<Integer, Integer> minValue = Collections.min(map.entrySet(), Comparator.comparing(Map.Entry::getValue));
        return minValue;
    }

    protected static void fillMap(Map<Integer, Integer> map) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(getFile())) {
            int data;
            while (fileInputStream.available() > 0) {
                data = fileInputStream.read();

                if (!map.containsKey(data)) {
                    map.put(data, 1);
                } else {
                    map.put(data, (map.get(data) + 1));
                }
            }
        }
    }

    protected static File getFile() throws IOException {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        File file = new File(reader.readLine());
        reader.close();

        return file;
    }

}
