package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[3];
        int count = 0;
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(reader.readLine());
            if (iArr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
