package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String s = null;
        if(o instanceof Cat) s = "Кошка";
        if(o instanceof Dog) s = "Собака";
        if(o instanceof Bird) s = "Птица";
        if(o instanceof Lamp) s = "Лампа";
        System.out.println(s);

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
