package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
            for (int j = 2; j < 11; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}
