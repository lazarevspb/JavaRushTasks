package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
     InputStream in = System.in;
     BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        List<Integer> list = new ArrayList();

        while (true){
            try {
                try {
                    list.add(Integer.valueOf(reader.readLine()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (NumberFormatException e) {
                list.forEach(System.out::println);
                break;
            }
        }
    }
}
