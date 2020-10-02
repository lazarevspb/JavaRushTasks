package com.javarush.task.task07.task0707;

import java.util.ArrayList;
import java.util.List;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> stringList  = new ArrayList();
        for (int i = 0; i < 5; i++) {
            stringList.add("string" + i);
        }
        System.out.println(stringList.size());

        stringList.forEach(System.out::println);
    }
}
