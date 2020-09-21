package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String[] strings = new String[2];

        for (int i = 0; i < 2; i++) {
            strings[i] = reader.readLine();
        }

        if (strings[0].equals(strings[1])){
            System.out.println("Имена идентичны");
        }else{
            if(strings[0].toCharArray().length == strings[1].toCharArray().length){
                System.out.println("Длины имен равны");
            }
        }
    }
}
