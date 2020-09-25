package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int count = 0;


        while (count < 10) {
            int nestedCounter = 0;
            while (nestedCounter < 10) {
                System.out.print("S");
                nestedCounter++;
            }
            System.out.println("");
            count++;
        }

    }
}
