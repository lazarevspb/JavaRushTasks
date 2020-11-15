package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.Arrays;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    int[] character = new int[127];

    FileInputStream fileInputStream = new FileInputStream(args[0]);
    int data;

    while (fileInputStream.available() > 0){
        data = fileInputStream.read();
        character[data]++;
    }

        for (int i = 0; i < character.length; i++) {
           if(character[i] != 0) {
                System.out.println((char) i + " " + character[i]);
            }
        }
    fileInputStream.close();
    }
}
