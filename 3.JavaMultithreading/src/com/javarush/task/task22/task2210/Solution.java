package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        getTokens("level22.lesson13.task01", ".");
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer =
                new StringTokenizer(query, delimiter);
        int count = tokenizer.countTokens();
        String[] result = new String[count];


        for (int i = 0; i < count; i++) {
            String token = tokenizer.nextToken();
            result[i] = token;
        }
        return result;
    }
}
