package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[2];
        for (int i = 0; i < 2; i++) {
            strings[i] = reader.readLine();
        }

        int age = Integer.parseInt(strings[1]);
        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
