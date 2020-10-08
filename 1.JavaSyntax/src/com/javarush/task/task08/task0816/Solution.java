package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
//        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        for (int i = 0; i < 10; i++) {
            map.put("Смирнов" + i, dateFormat.parse((int) (1 + (Math.random()) * 12) + " " + (int) (1 + (Math.random()) * 30) + " 2012"));
        }
//        map.forEach((s, date) -> System.out.println(s + " " + date));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        DateFormat dateFormat = new SimpleDateFormat("M");
        List<String> strings = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            int month = Integer.parseInt(dateFormat.format(entry.getValue()));
            if (month > 5 && month <= 8) {
                strings.add((String) entry.getKey());
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            map.remove(strings.get(i));
        }

//        System.out.println();
//        map.forEach((s, date) -> System.out.println(s + " " + date));

    }
    public static void main(String[] args) throws ParseException {
//        removeAllSummerPeople(createMap());

    }
}
