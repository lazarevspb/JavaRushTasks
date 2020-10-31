package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;

    public static void main(String[] args) {
        Solution solution = new Solution();

        {
//            System.out.printf("%d\n%f\n%f\n%b\n%d\n%d\n%d",
            System.out.println(solution.intVar);
            System.out.println(solution.doubleVar);
            System.out.println(solution.DoubleVar);
            System.out.println(solution.booleanVar);
            System.out.println(solution.ObjectVar);
            System.out.println(solution.ExceptionVar);
            System.out.println(solution.StringVar);

        }
    }
}
