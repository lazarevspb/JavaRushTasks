package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dfIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat dfOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    createPeople(args, dfIn);
                }
                break;

            case "-u":
                synchronized (allPeople) {
                    updatePeople(args, dfIn);
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    deletePeople(args);
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    getInfoPeople(args, dfOut);
                }
                break;
        }
    }

    protected static void getInfoPeople(String[] args, SimpleDateFormat dfOut) {
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt(args[i]);
            Date bd = allPeople.get(id).getBirthDate();
            System.out.printf("%s %s %s\n",
                    allPeople.get(id).getName(),
                    allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж",
                    dfOut.format(bd));
        }
    }

    protected static void createPeople(String[] args, SimpleDateFormat dfIn) throws ParseException {
        for (int i = 1; i < args.length; i += 3) {
            String name = args[i];
            String sex = args[i + 1];
            String bd = args[i + 2];
            Date date = dfIn.parse(bd);
            allPeople.add(sex.equals("м")
                    ? Person.createMale(name, date)
                    : Person.createFemale(name, date));

            System.out.println(allPeople.size() - 1);
        }
    }

    protected static void updatePeople(String[] args, SimpleDateFormat dfIn) throws ParseException {
        for (int i = 1; i < args.length; i += 4) {
            int id = Integer.parseInt(args[i + 0]);
            String name = args[i + 1];
            String sex = args[i + 2];
            String bd = args[i + 3];
            Date date = dfIn.parse(bd);
            allPeople.set(id, sex.equals("м")
                    ? Person.createMale(name, date)
                    : Person.createFemale(name, date));
        }
    }

    protected static void deletePeople(String[] args) {
        for (int i = 1; i < args.length; i++) {
            int id = Integer.parseInt(args[i]);

            allPeople.get(id).setBirthDate(null);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);
        }
    }
}
