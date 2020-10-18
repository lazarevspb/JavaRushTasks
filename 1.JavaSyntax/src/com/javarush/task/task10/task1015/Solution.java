package com.javarush.task.task10.task1015;


import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
      ArrayList<String>[] strings = new ArrayList[3];

        for (int i = 0; i < strings.length; i++) {
                strings[i] = new ArrayList<String>();
                strings[i].add("a" + i);
        }
        return strings;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}