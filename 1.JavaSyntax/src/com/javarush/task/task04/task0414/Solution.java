package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
            int year = Integer.parseInt(reader.readLine());
            System.out.println("количество дней в году: " + (isLeapYear(year)?366:365));
//        }
    }

    private static boolean isLeapYear(int year) {

        return (year % 4 == 0 && (!(year % 100 == 0) ^ year % 400 == 0));
    }
}