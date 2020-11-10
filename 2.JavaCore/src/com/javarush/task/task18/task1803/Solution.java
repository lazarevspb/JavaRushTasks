package com.javarush.task.task18.task1803;

import java.io.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Самые частые байты
*/

public class Solution {
    static Map<Integer, Integer> map = new HashMap();

    public static void main(String[] args) throws Exception {
        InputStream in = System.in;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            File file = new File(reader.readLine());
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                while (fileInputStream.available() > 0) {
                    Integer key;
                    key = fileInputStream.read();
                    if (map.containsKey(key)) {
                        map.put(key, (map.get(key) + 1));
                    } else map.put(key, 1);
                }

            }
        }

        /*
            1. Считываем байты и заносим в HashMap с помощью метода merge.
            map.merge(fileInputStream.read(),1, Integer::sum);

            2. Находим максимальное количество повторений;
            int maxValue = Collections.max(map.values());
            */

        Map.Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), // поиск наименьшего значения в map
                Comparator.comparing(Map.Entry::getValue));

        Map<Integer, Integer> mapFiltred = map.entrySet().stream()    // перемещение отфильтрованных элементов коллекции map
                .filter(entry -> entry.getValue().equals(maxEntry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        mapFiltred.forEach((integer, integer2) -> System.out.print(integer + " "));
    }
}
