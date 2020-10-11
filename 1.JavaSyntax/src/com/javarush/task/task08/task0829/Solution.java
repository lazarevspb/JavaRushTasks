package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();

        while (true) {
            String key = reader.readLine();
            if (key.isEmpty()) {
                break;
            }
            String value = reader.readLine();
            map.put(key, value);
        }
        String country = reader.readLine();
        if (map.containsKey(country)) {
            System.out.println(map.get(country));
        }
    }
}
