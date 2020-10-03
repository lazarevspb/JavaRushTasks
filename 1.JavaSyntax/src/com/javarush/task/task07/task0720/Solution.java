package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine().trim());
        int m = Integer.parseInt(reader.readLine().trim());

        for (int i = 0; i < n; i++) {
            strings.add(reader.readLine().trim());
        }

        for (int i = 0; i < m; i++) {
            strings.add(strings.remove(0));
        }
        strings.forEach(System.out::println);
    }
}
