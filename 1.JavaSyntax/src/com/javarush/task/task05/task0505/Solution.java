package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/


import static java.lang.Math.random;

public class Solution {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        int a = 0;
        int b = 10;
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat" + i, a + (int) (Math.random() * b), a + (int) (Math.random() * b), a + (int) (Math.random() * b));
        }

        System.out.println(cats[0].fight(cats[1]));
        System.out.println(cats[2].fight(cats[1]));
        System.out.println(cats[2].fight(cats[0]));

    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
