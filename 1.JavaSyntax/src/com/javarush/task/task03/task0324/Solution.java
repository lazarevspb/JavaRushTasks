package com.javarush.task.task03.task0324;

import java.util.Collections;
/* 
Меркантильные намерения
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я хочу большую зарплату, и для этого изучаю Java";
        Collections.nCopies(9, s + "\n").forEach(System.out::print);
        System.out.print(s);
    }
}
