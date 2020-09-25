package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < 1 || j < 1) {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
}
