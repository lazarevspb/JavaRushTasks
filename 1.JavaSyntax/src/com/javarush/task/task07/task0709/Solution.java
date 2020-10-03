package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine().trim());
        }

        int minLength = arrayList
                .stream()
                .min(Comparator.comparing(String::length)).get().length();

        arrayList
                .stream()
                .filter(s -> s.length() == minLength)
                .forEach(System.out::println);


    }
}
