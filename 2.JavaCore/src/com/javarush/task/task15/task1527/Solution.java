package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            String input = bufferedReader.readLine().trim();
            StringTokenizer stringTokenizer = new StringTokenizer(input, "?&");
            ArrayList<String> stringList = new ArrayList<>();
            String[] result = new String[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                result[i++] = stringTokenizer.nextToken();
            }
            for (int j = result.length - 1; j > 0; j--) {
                if (result[j].contains("obj")) {
                    stringList.add(result[j].split("=")[1]);
                    stringList.add(0, result[j].split("=")[0]);
                } else {
                    if (stringList.size() > 0) {
                        stringList.add(0, result[j].split("=")[0]);
                    } else {
                        stringList.add(result[j].split("=")[0]);
                    }
                }
            }
            if(stringList.contains("obj")) {
                printList(stringList);
            }
            else {
                for (String s : stringList) {
                    System.out.print(s + " ");
                }
            }
        }
    }

    protected static void printList(ArrayList<String> stringList) {
        for (int j = 0; j < stringList.size() - 1; j++) {
            System.out.print(stringList.get(j) + " ");
        }
        System.out.println();
        try {
            alert(Double.parseDouble(stringList.get(stringList.size()-1)));
        } catch (NumberFormatException e) {
            alert(stringList.get(stringList.size()-1));
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
