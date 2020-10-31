package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int x;
    int y;
    String s;

    public Solution() {

    }

    private Solution(String s) {
        this.s = s;
    }

    protected Solution(int x, String s) {
        this.x = x;
        this.s = s;
    }

    Solution(int x, int y, String s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    public static void main(String[] args) {


    }
}

