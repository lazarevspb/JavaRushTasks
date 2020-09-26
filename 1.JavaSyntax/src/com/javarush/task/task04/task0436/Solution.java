package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[2];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(reader.readLine().trim());
        }

        for (int i = 0; i < iArr[0]; i++) {
            for (int j = 0; j < iArr[1] ; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
