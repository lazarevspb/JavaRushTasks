package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>() ;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                System.out.println(list.stream().reduce((x, y) -> x + y).get());
                break;
            }else list.add(Integer.parseInt(s));
        }

    }
}
