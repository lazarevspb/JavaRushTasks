package com.javarush.task.task08.task0818;

import java.util.*;
import java.util.stream.Collectors;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            integerMap.put("name" + i, 200 + (int) (Math.random() * 1000));
        }
        return integerMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        map.values().removeIf(v -> v < 500);
    }


    public static void main(String[] args) {
    }
}