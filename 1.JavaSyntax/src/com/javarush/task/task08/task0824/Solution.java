package com.javarush.task.task08.task0824;

import java.util.ArrayList;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList();
        ArrayList<Human> children0 = new ArrayList();
        ArrayList<Human> children1 = new ArrayList();
        ArrayList<Human> children2 = new ArrayList();

        for (int i = 0; i < 9; i++) {
            if (i < 4){
                humans.add(new Human("grand" + i, i % 2 == 0, 100, i > 1 ? children0 : children1));
            } else if (i < 6) {
                humans.add(new Human("parent" + i, i % 2 == 0, 50, children2));
                if(i > 4){
                    children0.add(humans.get(i));
                }else {
                    children1.add(humans.get(i));
                }

            } else {
                children2.add(new Human("child" + (i - 6), i % 2 == 0, 10));
            }
        }
        humans.forEach(System.out::println);
        children2.forEach(System.out::println);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList();

        public Human(String name, boolean sex, int age, ArrayList<Human> child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = child;
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

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
