package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> stringMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            stringMap.put("second name" + i, "name" + (i % 2 == 0 ? i : i / 2));
        }
        return stringMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> stringsKey = new ArrayList<>();
        ArrayList<String> stringsValue = new ArrayList<>();
        ArrayList<Integer> integersPlace = new ArrayList<>();

        for (Map.Entry entry : map.entrySet()) {
            stringsKey.add(entry.getKey().toString());
            stringsValue.add(entry.getValue().toString());
        }

        for (int i = 0; i < stringsValue.size(); i++) {
            for (int j = i + 1; j < stringsValue.size(); j++) {
                if (stringsValue.get(i).equals(stringsValue.get(j))) {
                    integersPlace.add(j);
                    integersPlace.add(i);
                }
            }
        }
        integersPlace.forEach(integer -> System.out.println("integersPlace: " + integer));

        for (int i = 0; i < integersPlace.size(); i++) {
            removeItemFromMapByValue(map, stringsValue.get(integersPlace.get(i)));
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
