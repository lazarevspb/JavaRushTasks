package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int numberOfPositive = 0;
        int numberOfNegative = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[3];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(reader.readLine().trim());
            if (iArr[i] != 0) {
                if (iArr[i] > 0) {
                    numberOfPositive++;
                } else {
                    numberOfNegative++;
                }
            }
        }
        System.out.printf("количество отрицательных чисел: %d\n" +
                "количество положительных чисел: %d\n", numberOfNegative, numberOfPositive);
    }
}
