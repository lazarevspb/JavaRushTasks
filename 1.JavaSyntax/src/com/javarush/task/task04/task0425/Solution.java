package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] iArr = new int[2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(reader.readLine());
        }
        if (iArr[0] > 0 && iArr[1] > 0) System.out.println("1");
        if (iArr[0] < 0 && iArr[1] > 0) System.out.println("2");
        if (iArr[0] < 0 && iArr[1] < 0) System.out.println("3");
        if (iArr[0] > 0 && iArr[1] < 0) System.out.println("4");


    }
}
