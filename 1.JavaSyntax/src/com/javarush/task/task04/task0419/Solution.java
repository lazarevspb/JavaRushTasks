package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[4];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println(Math.max( (Math.max(iArr[0],iArr[1]) ),(Math.max(iArr[2],iArr[3]) )));

    }
}
