package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String sAge;
        String name;
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        sAge = reader.readLine();
        name = reader.readLine();
        System.out.printf("%s захватит мир через %s лет. Му-ха-ха!", name, sAge);
    }
}
