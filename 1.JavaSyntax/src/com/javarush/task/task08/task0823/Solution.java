package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        StringBuilder stringBuilder = new StringBuilder();

        String[] stringsArray = string.trim().split(" ");
        for (int i = 0; i < stringsArray.length; i++) {
            if ((stringsArray[i].equals("") || stringsArray[i].equals(" "))) {
                continue;
            } else {

                char[] charsArray = stringsArray[i].toCharArray();
                String s = String.valueOf(charsArray[0]).toUpperCase();
                charsArray[0] = s.charAt(0);
                String characterString = String.valueOf(charsArray) + " ";
                stringBuilder.append(characterString);

            }



        }
        System.out.println(stringBuilder);
    }
}
