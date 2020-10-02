package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] ints = new int[20];
    int[] ints1 = new int[10];
    int[] ints2 = new int[10];

        for (int i = 0; i < ints.length; i++) {
        ints[i] = Integer.parseInt(reader.readLine().trim());
        }
        ints1 =  Arrays.copyOfRange(ints, 0, 10);
        ints2 =  Arrays.copyOfRange(ints, 10, 20);

        Arrays.stream(ints2).forEach(System.out::println);


    }
}
