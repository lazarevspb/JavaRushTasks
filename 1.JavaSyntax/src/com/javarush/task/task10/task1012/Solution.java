package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
   private static List<Integer> alphabetCount = new ArrayList<>(33);
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr;
        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        for (int i = 0; i < 33; i++) {
            alphabetCount.add(i, 0);
        }



        for (int i = 0; i < list.size(); i++) {
            cArr = list.get(i).toCharArray();
            for (int j = 0; j < alphabet.size(); j++) {
                for (int k = 0; k < cArr.length ; k++) {
                    if (alphabet.get(j).equals(cArr[k])) {
                        alphabetCount.set(j, alphabetCount.get(j) + 1);
                    }
                }



            }
        }

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + alphabetCount.get(i)   );
        }

    }


}
