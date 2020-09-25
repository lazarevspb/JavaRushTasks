package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int a = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        while (a > 0) {
            System.out.println(s);
            a--;
        }
    }
}
