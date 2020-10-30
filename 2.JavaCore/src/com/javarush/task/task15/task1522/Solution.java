package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
    InputStream in = System.in;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
      String s = reader.readLine().trim();
      if(s.equals(Planet.SUN) || s.equals(Planet.EARTH) || s.equals(Planet.MOON)) {
        if (s.equals(Planet.SUN)) thePlanet = Sun.getInstance();
        if (s.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
        if (s.equals(Planet.MOON)) thePlanet = Moon.getInstance();


      }  else thePlanet = null;
    }
    }
}


