package com.javarush.task.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Фейс-контроль
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        if (a > 20){
            System.out.println("И 18-ти достаточно");
        }

    }
}
