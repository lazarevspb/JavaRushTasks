package com.javarush.task.task18.task1817;

import java.io.*;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        try (FileInputStream in = new FileInputStream(file)) {
            int x;
            int count = 0;
            int space = 0;

            while ((x = in.read()) != -1) {
                count++;
                if (x == 32) {
                    space++;
                }
            }
           float result  = (space/(float)count) * 100;
            System.out.printf("%.2f",result);
        }
    }
}
