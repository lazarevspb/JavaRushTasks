package com.javarush.task.task02.task0205;

/* 
Прибавка к зарплате

Прибавка к зарплате
В методе public static void hackSalary(int a) увеличь зарплату на 100 и выведи на экран надпись:
"Твоя зарплата составляет: <a+100> долларов в месяц."
Где <a+100> - это зарплата увеличенная на 100.

Подсказки:
Используй конструкцию "текст " + (a+число) + " текст".
Удели внимание пробелам в тексте.

Пример вывода на экран для а = 700:
Твоя зарплата составляет: 800 долларов в месяц.


Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод hackSalary не должен возвращать результат.
4. Метод main должен вызвать метод hackSalary только один раз.
5. Метод hackSalary должен увеличить переданное число на 100 и вывести на экран надпись согласно шаблону.
*/
public class Solution {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }

    public static void hackSalary(int a) {
        System.out.println("Твоя зарплата составляет: " + (a+100) + " долларов в месяц.");
    }
}
