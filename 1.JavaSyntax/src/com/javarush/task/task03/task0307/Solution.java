package com.javarush.task.task03.task0307;
import java.util.ArrayList;
/* 
Привет StarCraft!
Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.


Требования:
1. Нельзя изменять классы Zerg, Protoss и Terran.
2. Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
3. Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
4. Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.
*/

public class Solution {
    public static void main(String[] args) {
ArrayList<Zerg> zergArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            zergArrayList.add(i, new Zerg());
            zergArrayList.get(i).name = "zerg" + i;
        }

        ArrayList<Protoss> protossArrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            protossArrayList.add(i, new Protoss());
            protossArrayList.get(i).name = "protoss" + i;
        }

        ArrayList<Terran> terranArrayList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            terranArrayList.add(i, new Terran());
            terranArrayList.get(i).name = "terran" + i;
        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
