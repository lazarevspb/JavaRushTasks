package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String financialExpectations = reader.readLine();
        System.out.printf("Я буду зарабатывать $%s в час", financialExpectations);
    }
}
