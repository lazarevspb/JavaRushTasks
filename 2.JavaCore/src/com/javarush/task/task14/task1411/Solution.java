package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = new ArrayList<>(Arrays.asList("user", "loser", "coder", "proger"));
        List<Person> personList = new ArrayList<>();
        Map<String, Integer> personMap = new HashMap<>();
        boolean condition = true;


        //тут цикл по чтению ключей, пункт 1
        while (condition) {
            int countEquals = 0;
            key = reader.readLine().trim();
            for (int i = 0; i < list.size(); i++) {
                if (key.equals(list.get(i))) {
                    personMap.put(key, personMap.get(key) == null ? 0 : personMap.get(key) + 1);
                    personMap.forEach((s, integer) -> System.out.println(s + " " + integer));
                    countEquals++;
                    break;
                }
            }
            if (countEquals == 0) {
                break;
            }
        }

        for (Map.Entry<String, Integer> entry : personMap.entrySet()) {

            switch (entry.getKey()) {

                case "user":
                    System.out.println("user entry.getValue()" + entry.getValue());
                    for (int i = 0; i < entry.getValue() + 1; i++) {
                        personList.add(new Person.User());
                    }
                    break;
                case "loser":
                    for (int i = 0; i < entry.getValue() + 1; i++) {
                        personList.add(new Person.Loser());
                    }
                    break;
                case "coder":
                    for (int i = 0; i < entry.getValue() + 1; i++) {
                        personList.add(new Person.Coder());
                    }
                    break;
                case "proger":
                    for (int i = 0; i < entry.getValue() + 1; i++) {
                        personList.add(new Person.Proger());
                    }
                    break;
            }
        }

        for (int i = 0; i < personList.size(); i++) {
            doWork(personList.get(i));
        }
    }

    public static void doWork(Person person) {
       if(person instanceof Person.User) ((Person.User) person).live();
       if(person instanceof Person.Loser) ((Person.Loser) person).doNothing();
       if(person instanceof Person.Coder) ((Person.Coder) person).writeCode();
       if(person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
