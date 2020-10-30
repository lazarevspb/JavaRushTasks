package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        String result;
        BigDecimal fact = new BigDecimal(1);
        if (n == 0 || n == 1) result = "1";
        else if (n < 0) result = "0";
        else {
            for (int i = n; i > 0; i--) {
                fact = fact.multiply(BigDecimal.valueOf(i));
            }
            result = fact.toString();
        }
        return result;
    }
}
