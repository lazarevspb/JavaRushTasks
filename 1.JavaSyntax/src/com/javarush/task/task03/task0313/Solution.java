package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    private static String[] strings = {"Мама", "Мыла", "Раму"};

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j <strings.length; j++) {
                for (int k = 0; k < strings.length; k++) {
                    if(i != j && j != k && k !=i   ){
                    System.out.print(strings[i] + strings[j] + strings[k] + "\n");
                    }
                }
            }
        }
    }
}
