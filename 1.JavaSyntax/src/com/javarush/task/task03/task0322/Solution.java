package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1, name2, name3;

        name1 = reader.readLine();
        name2 = reader.readLine();
        name3 = reader.readLine();

        System.out.printf("%s + %s + %s = Чистая любовь, да-да!", name1, name2, name3);
    }
}