package com.javarush.task.task07.task0708;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lengthMax = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine().trim());
            if (i != 0) {
                if (strings.get(i).length() > lengthMax) {
                    lengthMax = strings.get(i).length();
                }
            } else {
                lengthMax = strings.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() >= lengthMax) {
                System.out.println(strings.get(i));
            }
        }
    }
}
