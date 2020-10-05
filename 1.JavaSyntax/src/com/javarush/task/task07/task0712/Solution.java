package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine().trim());
        }
        
        int minLength = arrayList
                .stream()
                .min(Comparator.comparing(String::length)).get().length();

        int maxLength = arrayList
                .stream()
                .max(Comparator.comparing(String::length)).get().length();

                for (String s : arrayList) {
            if (s.length() == minLength) {
                System.out.println(s);
                break;
            }
            if (s.length() == maxLength) {
                System.out.println(s);
                break;
            }
        }
        
    }
}
