package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        int i = Integer.parseInt(s);

        if (i > 0 && i < 1000) {
            String parity = i % 2 == 0 ? "четное" : "нечетное";
            String digitCapacity = s.length() == 3 ? "трехзначное" : s.length() == 2 ? "двузначное" : "однозначное";
            System.out.printf("%s %s число", parity, digitCapacity);
        }
    }
}
