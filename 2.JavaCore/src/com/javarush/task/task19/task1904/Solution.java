package com.javarush.task.task19.task1904;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {
    public static void main(String[] args) throws IOException {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            String[] personStrings = fileScanner.nextLine().split(" ", 4);;

            String firstName = personStrings[1];
            String middleName = personStrings[2];
            String lastName = personStrings[0];
            Date birthDate = null;

            try {
                birthDate = simpleDateFormat.parse(personStrings[3]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Person person = new Person(firstName, middleName, lastName, birthDate);
            System.out.println(person.toString());
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
