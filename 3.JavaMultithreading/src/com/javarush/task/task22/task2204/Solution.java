package com.javarush.task.task22.task2204;

/* 
Форматирование строки
%a  Шестнадцатеричное значение с плавающей точкой
%b  Логическое (булево) значение аргумента
%c  Символьное представление аргумента
%d  Десятичное целое значение аргумента
%h  Хэш-код аргумента
%e  Экспоненциальное представление аргумента
%f  Десятичное значение с плавающей точкой
%g  Выбирает более короткое представление из двух: %е или %f
%o  Восьмеричное целое значение аргумента
%n  Вставка символа новой строки
%s  Строковое представление аргумента
%t  Время и дата
%x  Шестнадцатеричное целое значение аргумента
%%  Вставка знака %

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00
    }

    public static String getFormattedString() {
        return "20 / 7 = %.2f%nExp = %.2e";
    }
}
