package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] ints = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0;
        int uneven = 0;

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine().trim());
            if (i % 2 == 0) {
                even += ints[i];
            } else {
                uneven += ints[i];
            }
        }

        System.out.println("В домах с " + (even > uneven ? "четными" : "нечетными") +
                " номерами проживает больше жителей.");


    }
}
