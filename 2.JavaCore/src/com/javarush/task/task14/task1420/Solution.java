package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int tmp = Integer.parseInt(reader.readLine());
            if(tmp < 1 ) {
                throw new Exception("Число должно быть целым и положительным");
            }
            integers.add(tmp);
        }
        int a = integers.get(0);
        int b = integers.get(1);

        System.out.println(getGreatestCommonFactor(a, b));
    }

    public static int getGreatestCommonFactor(int a, int b) {
        if (b == 0)
            return a;
        return getGreatestCommonFactor(b, a % b);
    }
}

/*
* Вычисление НОД — ошибка, которой не замечают
* https://habr.com/ru/post/205106/
* */