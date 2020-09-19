package com.javarush.task.task02.task0217;

import java.util.Comparator;
import java.util.stream.Stream;

/*
Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)

Подсказка:
Нужно написать тело двух существующих функций min.


Требования:
1. Программа должна выводить текст на экран.
2. Методы min не должны выводить текст на экран.
3. Метод main должен вызывать метод min(a, b) и метод min(a, b, c, d).
4. Метод main должен выводить на экран результат работы методов min. Каждый раз с новой строки.
5. Метод min(a, b) должен возвращать минимальное значение из чисел a, b.
6. Метод min(a, b, c, d) должен использовать метод min(a, b)
7. Метод min(a, b, c, d) должен возвращать минимальное значение из чисел a, b, c, d.
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
       return min(min(a,b), min(c , d));
    }

    public static int min(int a, int b) {
      return   Stream.of(a,b).min(Comparator.comparingInt(o -> o)).get();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}