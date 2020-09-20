package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());

        String sResult;

        switch (x) {
            case 1:
                sResult = "понедельник";
                break;
            case 2:
                sResult = "вторник";
                break;
            case 3:
                sResult = "среда";
                break;
            case 4:
                sResult = "четверг";
                break;
            case 5:
                sResult = "пятница";
                break;
            case 6:
                sResult = "суббота";
                break;
            case 7:
                sResult = "воскресенье";
                break;
            default:
                sResult = "такого дня недели не существует";
                break;
        }
        System.out.println(sResult);
    }
}