package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList("мама", "мыла", "раму"));

        for (int i = arrayList.size(); i > 0 ; i-- ) {
            arrayList.add(i,"именно");
        }

        arrayList.forEach(System.out::println);
    }
}
