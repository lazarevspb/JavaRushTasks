package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        List<String> result;
        strings
                .removeIf(s -> s.contains("р") && !s.contains("л"));

        result = strings.stream()
                .filter(s -> s.contains("л") && !s.contains("р"))
                .collect(Collectors.toList());

        strings.addAll(result);
        return strings;
    }
}