package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints   = new int[10];
        String[] strings    = new String[10];

        for(int i = 0; i < ints.length; i++) {
            strings[i] = reader.readLine().trim();
            ints[i] = strings[i].length();
            System.out.println("\r" + ints[i]);
        }

    }
}
