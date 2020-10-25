package com.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Коты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
            String catName;

            while (!(catName = bufferedReader.readLine()).equals("")) {
                Cat cat = CatFactory.getCatByKey(catName);
                System.out.println(cat.toString());
            }
    }


static class CatFactory {
    static Cat getCatByKey(String key) {
        Cat cat = null;
        if ("vaska".equals(key)) {
            cat = new MaleCat("Василий");
        } else if ("murka".equals(key)) {
            cat = new FemaleCat("Мурочка");
        } else if ("kiska".equals(key)) {
            cat = new FemaleCat("Кисюлька");
        } else {
            cat = new Cat(key);
        }
        return cat;
    }
}

static class Cat {
    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Я уличный кот " + getName();
    }
}

static class MaleCat extends Cat {
    MaleCat(String name) {
        super(name);
    }

    public String toString() {
        return "Я - солидный кошак по имени " + getName();
    }
}

static class FemaleCat extends Cat {
    FemaleCat(String name) {
        super(name);
    }

    public String toString() {
        return "Я - милая кошечка по имени " + getName();
    }
}
}
