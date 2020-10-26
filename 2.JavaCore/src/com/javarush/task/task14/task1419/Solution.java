package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Class.forName("someClass");
        } catch (ClassNotFoundException e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s.split(" ");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] ints = new int[1];
            ints[0] = ints[2];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object x[] = new String[3];
            x[0] = new Integer(0);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("fileName");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            exceptions.add(e);
        }
        try {
            throw new IOException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new java.sql.SQLException();
        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
