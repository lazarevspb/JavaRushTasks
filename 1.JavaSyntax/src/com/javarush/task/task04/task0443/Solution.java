package com.javarush.task.task04.task0443;

import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list.add(reader.readLine().trim());
        }
        System.out.printf("Меня зовут %s.\nЯ родился %s.%s.%s", list.get(0), list.get(3), list.get(2), list.get(1));
    }
}
