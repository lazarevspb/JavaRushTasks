package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        params.entrySet()
                .stream()
                .filter(entry -> entry.getValue() != null && entry.getKey() != null)
                .forEach(entry -> sb.append(String.format("%s = '%s' and ", entry.getKey(), entry.getValue())));
        sb.setLength(sb.length() > 5 ? sb.length() - 5 : 0);
        return sb.toString();
    }
}
