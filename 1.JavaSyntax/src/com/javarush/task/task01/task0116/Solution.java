package com.javarush.task.task01.task0116;

/* 
Вносим изменения в код

Внеси изменения в программу, чтобы переменная name имела значение Amigo.


Требования:
1. Переменной name должно присваиваться значение сразу после создания.
2. Должно быть объявлено 2 переменных.
3. Значение переменной text изменять нельзя.
4. Команду вывода текста на экран изменять нельзя.
5. Программа должна выводить текст "Hello, Amigo!".
*/

public class Solution {
    public static void main(String[] args) {
        String name = "Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text);
    }
}
