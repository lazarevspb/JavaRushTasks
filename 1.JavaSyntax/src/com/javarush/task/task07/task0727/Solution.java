package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {
            StringBuilder string = new StringBuilder();
            if(strings.get(i).length() % 2 == 0){
                for (int j = 0; j < 2; j++) {
                    string.append(strings.get(i)).append(" ");
                }
            } else {
                for (int k = 0; k < 3; k++) {
                    string.append(strings.get(i)).append(" ");
                }
            }
            resultStrings.add(string.toString());
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
