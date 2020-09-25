package com.javarush.task.task04.task0439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Письмо счастья
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%s любит меня.\n", s);
        }
    }
}
