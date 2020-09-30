package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cat1 = reader.readLine(); //дедушка Вася
        Cat catVasya = new Cat(cat1, null, null);

        String cat2 = reader.readLine();
        Cat catMurka = new Cat(cat2, null, null);

        String cat3 = reader.readLine();
        Cat catCotofey = new Cat(cat3, catVasya, null);

        String cat4 = reader.readLine();
        Cat catVasilisa = new Cat(cat4, null, catMurka);

        String cat5 = reader.readLine();
        Cat catMurch = new Cat(cat5, catCotofey, catVasilisa);

        String cat6 = reader.readLine();
        Cat catPush = new Cat(cat6, catCotofey, catVasilisa);


        System.out.println(catVasya);
        System.out.println(catMurka);
        System.out.println(catCotofey);
        System.out.println(catVasilisa);
        System.out.println(catMurch);
        System.out.println(catPush);

    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        public Cat getFather() {
            return father;
        }

        public Cat getMother() {
            return mother;
        }

        public String getName() {
            return name;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }


        public Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
        }

        Cat(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother, no father";
            if (mother != null && father == null)
            return "The cat's name is " + name + ", mother is " + mother.getName() + ", no father";
            if (father != null && mother == null)
                return "The cat's name is " + name + ", no mother, father is " + father.getName();
            if (father != null && mother != null)
                return "The cat's name is " + name + ", mother is " + mother.getName() + ", father is " + father.getName();
            else return "none";
        }
    }

}
