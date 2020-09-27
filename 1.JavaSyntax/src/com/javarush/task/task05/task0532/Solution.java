package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                list.add(Integer.parseInt(s));
            }
        maximum = list.stream().max(Integer::compareTo).get();
        System.out.println(maximum);
        }


    }
}
