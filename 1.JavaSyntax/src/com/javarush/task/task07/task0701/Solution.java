package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[20];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(reader.readLine().trim());
        }
        return iArr;
    }

    public static int max(int[] array) {

        return Arrays.stream(array).max().getAsInt();
    }
}
