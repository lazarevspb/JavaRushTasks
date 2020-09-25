package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int count = 1;

        while (count < 11) {
            int nestedCount = 0;
            int result = 0;
            while (nestedCount < 10) {
                if (count == 1) {
                    System.out.print(count + nestedCount + " ");
                } else {
                    result += count;
                    System.out.print(result + " ");
                }
                nestedCount++;
            }
            System.out.println("");
            count++;
        }

    }
}
