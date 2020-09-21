package com.javarush.task.task04.task0408;

/* 
Хорошо или плохо?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        String result = "";
        if(a > 5) result = "больше";
        if(a < 5) result = "меньше";
        if(a == 5) result = "равно";
        System.out.printf("Число %s 5\n", result);
    }
}