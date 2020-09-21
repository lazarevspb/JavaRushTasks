package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.*;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[3];
        int count = 0;
        int result = 0;
        while (count < iArr.length) {
            iArr[count] = Integer.parseInt(reader.readLine());
            count++;
        }
        count = 1;
        if (iArr[0] == iArr[1]) {
            count++;
            result = iArr[0];
        }
        if (iArr[1] == iArr[2]) {
            count++;
            result = iArr[1];
        }
        if (iArr[0] == iArr[2]) {
            count++;
            result = iArr[2];
        }

        for (int i = 0; i < (Math.min(count, 3)); i++) {
            if (result != 0) {
                System.out.print(result + " ");
            }
        }
    }
}