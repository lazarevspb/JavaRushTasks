package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> integers = new HashSet<>();
        while (integers.size() < 20) {
            integers.add((int) (Math.random() * 20));
        }
        return integers;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() > 10) {
                iterator.remove();
                }
            }
        }
        return set;
    }
    public static void main(String[] args) {
    }
}
