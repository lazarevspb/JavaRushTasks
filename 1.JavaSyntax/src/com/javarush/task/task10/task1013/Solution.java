package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String secondName;
        private int age;
        private int salary;
        private int secondAge;
        private int secondSalary;

        public Human(String name, String secondName, int age, int salary, int secondAge, int secondSalary) {
            this.name = name;
            this.secondName = secondName;
            this.age = age;
            this.salary = salary;
            this.secondAge = secondAge;
            this.secondSalary = secondSalary;
        }

        public Human(String name, String secondName, int age, int salary, int secondAge) {
            this.name = name;
            this.secondName = secondName;
            this.age = age;
            this.salary = salary;
            this.secondAge = secondAge;
        }

        public Human(String name, int age, int salary, int secondAge) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.secondAge = secondAge;
        }

        public Human(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String secondName, int age, int salary, int secondAge, int secondSalary) {
            this.secondName = secondName;
            this.age = age;
            this.salary = salary;
            this.secondAge = secondAge;
            this.secondSalary = secondSalary;
        }

        public Human(String name, String secondName) {
            this.name = name;
            this.secondName = secondName;
        }

        public Human(int age, int salary, int secondAge, int secondSalary) {
            this.age = age;
            this.salary = salary;
            this.secondAge = secondAge;
            this.secondSalary = secondSalary;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }
    }
}
