package com.javarush.task.task14.task1414;

import com.javarush.task.task14.task1414.Solution.Movie;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
MovieFactory
cartoon
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String key;

//        while ((key = bufferedReader.readLine()).matches("cartoon|thriller|soapOpera")) {
////            Movie movie = MovieFactory.getMovie(key);
//
//            System.out.println(MovieFactory.getMovie(key).getClass().getSimpleName());
//
//        }
//        System.out.println(MovieFactory.getMovie(key).getClass().getSimpleName());


        while (true) {
            if ((key = bufferedReader.readLine()).matches("cartoon|thriller|soapOpera")) {
                System.out.println(MovieFactory.getMovie(key).getClass().getSimpleName());
            } else {
                try {
                    System.out.println(MovieFactory.getMovie(key).getClass().getSimpleName());
                } catch (Exception e) {
                }
                break;
            }
        }
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }


}
