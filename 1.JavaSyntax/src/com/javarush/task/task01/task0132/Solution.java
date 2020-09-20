package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = "" + number;
        char[] cArr = s.toCharArray();
        int[] iArr = new int[cArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(String.valueOf(cArr[i]));
        }

        return Arrays.stream(iArr)
                .reduce(Integer::sum)
                .getAsInt();
    }
}