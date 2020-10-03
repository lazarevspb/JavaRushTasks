package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine().trim());
        }

        for (int i = 0; i < 13; i++) {
            arrayList.add(0, arrayList.get(arrayList.size()-1));
                arrayList.remove(arrayList.size()-1);
        }
        arrayList.forEach(System.out::println);
    }
}
