package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        try (FileInputStream in = new FileInputStream(args[0])) {
            int x;
            while ((x = in.read()) != -1) {
                if(x >= 65 && x <= 90 || x >= 97 && x <= 122) count++;
            }
            System.out.println(count);
        }


    }
}
