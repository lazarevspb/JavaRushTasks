package com.javarush.task.task08.task0801;

import java.util.HashSet;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("арбуз");
        strings.add("банан");
        strings.add("вишня");
        strings.add("груша");
        strings.add("дыня");
        strings.add("ежевика");
        strings.add("женьшень");
        strings.add("земляника");
        strings.add("ирис");
        strings.add("картофель");
        strings.forEach(System.out::println);
    }
}
