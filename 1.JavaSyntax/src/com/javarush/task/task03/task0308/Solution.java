package com.javarush.task.task03.task0308;

import java.util.stream.IntStream;
/* 
Произведение 10 чисел

Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.


Требования:
1. Программа должна выводить целое число на экран.
2. Метод main должен вызывать функцию System.out.println.
3. Выведенное число должно быть больше трех миллионов.
4. Выведенное число должно соответствовать заданию.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(
                multiplicationOfTenNumbers(10));
    }

    private static int multiplicationOfTenNumbers(int f) {
        if (f <= 1)
            return 1;
        else
            return IntStream.rangeClosed(2, f)
                    .reduce((x, y) -> x * y)
                    .getAsInt();
    }

}
