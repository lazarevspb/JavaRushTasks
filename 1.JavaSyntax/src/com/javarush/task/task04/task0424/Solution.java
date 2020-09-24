package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[3];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(reader.readLine());
        }
                if (iArr[0] == iArr[1]) System.out.println(3);
                if (iArr[2] == iArr[0]) System.out.println(2);
                if (iArr[2] == iArr[1]) System.out.println(1);
        }

    }

