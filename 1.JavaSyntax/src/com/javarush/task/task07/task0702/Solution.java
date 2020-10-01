package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];

        for (int i = 0; i < 8; i++) {
            strings[i] = reader.readLine().trim();
        }

//        Stream.of(strings)
//                .sorted((o1, o2) -> -1)
//                .forEach(System.out::println);


        Stream.of(strings)
                .sorted((o1, o2) -> -1)
                .forEach(System.out::println);

    }
}