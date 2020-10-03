package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        int maximum;
        int minimum;
        int[] ints0;

        ints0 = getInts();

        maximum = getMax(ints0);
        minimum = getMin(ints0);

        System.out.print(maximum + " " + minimum);
    }

    private static int getMin(int[] ints0) {
        int min = ints0[0];
        for (int j : ints0) {
            if (j <= min) {
                min = j;
            }
        }
        return min;
    }

    private static int getMax(int[] ints0) {
        int max = ints0[0];
        for (int j : ints0) {
            if (j >= max) {
                max = j;
            }
        }
        return max;
    }

    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine().trim());
        }
        return ints;
    }
}
