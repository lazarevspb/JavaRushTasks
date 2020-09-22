package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i  = (int)Double.parseDouble(reader.readLine());
         i %= 5;
        if(i>=0 && i <3) System.out.println("зелёный");
        if(i == 3) System.out.println("жёлтый");
        if(i == 4) System.out.println("красный");
    }
}