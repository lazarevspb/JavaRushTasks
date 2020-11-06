package com.javarush.task.task17.task1710;

import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        DateFormat dateFormatInput = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String[] stringsArr;
        InputStream in = System.in;
        if (args[0].equals("-c")) {
            stringsArr = getArrayFromInput(args);

            String name = stringsArr[0];
            String sex = stringsArr[1];
            Date bd = null;
            try {
                bd = dateFormatInput.parse(stringsArr[2]);
            } catch (ParseException e) {
                e.printStackTrace();
            }


            allPeople.add(((sex.equals("м")) ? Person.createMale(name, bd)
                    : Person.createFemale(name, bd)));

            System.out.println(allPeople.size() - 1);
        } else if (args[0].equals("-u")) {
            stringsArr = getArrayFromInput(args);

            int id = Integer.parseInt(stringsArr[0]);
            String name = stringsArr[1];
            String sex = stringsArr[2];
            Date bd = null;
            try {
                bd = dateFormatInput.parse(stringsArr[3]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            allPeople.set(id, (sex.equalsIgnoreCase("m")) ? Person.createMale(name, bd)
                    : Person.createFemale(name, bd));
        } else if (args[0].equals("-d")) {
            stringsArr = getArrayFromInput(args);
            int id = Integer.parseInt(stringsArr[0]);

            allPeople.get(id).setBirthDate(null);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);

        } else if (args[0].equals("-i")) {
            stringsArr = getArrayFromInput(args);
            int id = Integer.parseInt(stringsArr[0]);

            System.out.printf("%s %s %s", allPeople.get(id).getName(),
                    allPeople.get(id).getSex() == Sex.MALE ? "м" : "ж",
                    dateFormatOutput.format(allPeople.get(id).getBirthDate()));
        }
    }

    protected static String[] getArrayFromInput(String[] s) {
        String[] stringsArr;
        stringsArr = Arrays.stream(s)
                .skip(1)
                .map(String::trim)
                .toArray(String[]::new);
        return stringsArr;
    }

}
