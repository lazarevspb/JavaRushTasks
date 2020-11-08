package com.javarush.task.task18.task1801;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Максимальный байт
https://javarush.ru/quests/lectures/questcore.level08.lecture02

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        File file = new File(reader.readLine());


        int maxByte = 0;

        FileInputStream fileInputStream = new FileInputStream(file);
        while (fileInputStream.available() > 0) {
            int data =   fileInputStream.read();
            if(data > maxByte){
                maxByte = data;
            }
        }
        fileInputStream.close();
        System.out.println(maxByte);
    }
}
