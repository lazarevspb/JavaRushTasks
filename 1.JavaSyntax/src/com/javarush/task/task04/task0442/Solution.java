package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        while (true) {
            int number = Integer.parseInt(reader.readLine().trim());
            result += number;
            if (number == -1) break;
        }
        System.out.println(result);
    }
}
