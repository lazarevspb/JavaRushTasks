package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers0 = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();
        ArrayList<Integer> integers3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integers0.add(Integer.parseInt(reader.readLine().trim()));

            if (integers0.get(i) % 3 == 0 || integers0.get(i) % 2 == 0) {
                if (integers0.get(i) % 3 == 0) {
                    integers1.add(integers0.get(i));
                }
                if (integers0.get(i) % 2 == 0) {
                    integers2.add(integers0.get(i));
                }
            } else {
                integers3.add(integers0.get(i));
            }
        }

        printList(integers1);
        printList(integers2);
        printList(integers3);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(System.out::println);
    }

}
