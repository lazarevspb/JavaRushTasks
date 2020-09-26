package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[3];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine().trim());
        }
        Arrays.sort(ints);
        System.out.println(ints[1]);

    }
}
