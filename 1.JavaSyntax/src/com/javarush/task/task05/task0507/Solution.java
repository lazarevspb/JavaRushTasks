package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new ArrayList<>();

        while (true) {
            integerList.add(Integer.parseInt(reader.readLine().trim()));
            if (integerList.get(integerList.size() - 1) == -1) {
                break;
            }
        }
        if (integerList.size() > 1) {
            double sum;
            sum = integerList
                    .stream()
                    .mapToInt((s) -> Integer.parseInt(String.valueOf(s)))
                    .limit(integerList.size() - 1)
                    .average()
                    .getAsDouble();

            System.out.println(sum);
        }

    }
}

