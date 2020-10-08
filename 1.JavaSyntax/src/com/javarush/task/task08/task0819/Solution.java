package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Cat cat :
                cats) {
            cats.remove(cat);
            break;
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        cats.forEach(System.out::println);
    }

    public static class Cat{
        public Cat() {
        }
    }
}
