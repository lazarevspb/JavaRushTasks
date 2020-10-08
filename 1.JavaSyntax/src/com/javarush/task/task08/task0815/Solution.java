package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("second name" + i, "name" + i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count1 = 0;
       for (Map.Entry<String, String> entry : map.entrySet()){
           if(entry.getValue().equals(name)){
               count1++;
           }
       }
        return count1;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        if (map.containsKey(lastName)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
