package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
        while (true){
            String s = bufferedReader.readLine().trim();
            if(s.equals("exit")) break;
             if(s.contains(".") && isNumeric(s)) {
                 double d = Double.parseDouble(s);
                 print(d);
             } else if (isNumeric(s)){
                 int i = 0;
                     i = Integer.parseInt(s);
                 if(i > 0 && i < 128) print((short) i);
                 else if( i <= 0 || i >= 128) print((Integer) i);
             }
             else print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

}
