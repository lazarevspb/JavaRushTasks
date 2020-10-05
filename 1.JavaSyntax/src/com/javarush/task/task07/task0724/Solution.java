package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> humansNoFatherNoMather = new ArrayList<>();
        ArrayList<Human> humans = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
                humansNoFatherNoMather.add(new Human("name" + i, (i % 2 == 0), 5));
        }

        for (int i = 0; i < 5; i++) {
            humans.add(new Human("name" +(4 + i), (i % 2 == 0), 5, humansNoFatherNoMather.get(i  >  3 ? i - 3 : i), humansNoFatherNoMather.get(i  >  3 ? i - 2 : i)));
        }

        humansNoFatherNoMather.forEach(System.out::println);
        humans.forEach(System.out::println);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}