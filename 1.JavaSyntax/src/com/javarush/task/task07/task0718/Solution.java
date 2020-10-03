package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        

        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine().trim());
        }
        int tmpValue = arrayList.get(0).length();
        for (int i = 0; i < arrayList.size(); i++) {
            if (tmpValue <= arrayList.get(i).length()) {
                tmpValue = arrayList.get(i).length();
                
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}

