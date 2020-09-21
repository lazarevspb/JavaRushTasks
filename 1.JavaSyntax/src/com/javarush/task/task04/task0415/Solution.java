package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int count = 0;
        while (count < arr.length) {
            arr[count] = Integer.parseInt(reader.readLine());
            count++;
        }
        System.out.println("Треугольник " + (isATriangle(arr) ? "существует." : "не существует."));
    }

    private static boolean isATriangle(int[] arr) {
        return arr[0] + arr[1] > arr[2] && arr[2] + arr[0] > arr[1] && arr[2] + arr[1] > arr[0];
    }
}