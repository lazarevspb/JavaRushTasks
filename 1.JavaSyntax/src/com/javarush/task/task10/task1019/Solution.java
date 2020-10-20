package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer>    integerStringMap = new HashMap<>();

        int id = 0;
        String name = null;
        String tmp = null;
        while (true) {

            tmp = reader.readLine();
            if(tmp.equals(" ") || tmp.equals("")) break;
            id = Integer.parseInt(tmp);
            name = reader.readLine();
            integerStringMap.put(name, id);
        }
        integerStringMap.forEach((s, integer) -> System.out.println(integer + " " + s));
    }
}
