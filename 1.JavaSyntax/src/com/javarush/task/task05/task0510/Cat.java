package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    /*У класса должен быть метод initialize,
    принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.*/
    public void initialize(String name) {
        this.weight = 5;
        this.color = "color";
        this.name = name;
        this.age = 5;
    } //Имя

    /*У класса должен быть метод initialize,
    принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.*/
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "color";
    }// Имя, вес, возраст

    /*У класса должен быть метод initialize, принимающий в качестве параметров
    имя, возраст и инициализирующий все переменные класса, кроме адреса.
     */
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "color";
    } //- Имя, возраст (вес стандартный)

    /* У класса должен быть метод initialize, принимающий в качестве параметров
    вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
     */
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 5;

    }// вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)


    /* У класса должен быть метод initialize, принимающий в качестве параметров
    вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.*/
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
        this.name = null;

    } //вес, цвет, адрес (чужой домашний кот)


    public static void main(String[] args) {

    }
}
