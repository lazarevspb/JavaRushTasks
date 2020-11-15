package com.javarush.task.task18.task1820;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Округление чисел
https://javarush.ru/groups/posts/2773-okruglenie-chisel-v-java
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file0;
        String file1;
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            file0 = bufferedReader.readLine().trim();
            file1 = bufferedReader.readLine().trim();
        }
//        file0 = "file0";
//        file1 = "file1";

        FileInputStream fileInputStream = new FileInputStream(file0);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        byte[] buffer = new byte[fileInputStream.available()];

        while (fileInputStream.available() > 0) { //чтение файла
            fileInputStream.read(buffer);
        }

        String inputFile = new String(buffer, StandardCharsets.UTF_8); //Конвертация массива byte[] в String;
        String[] strings = inputFile.split(" ");

//      String[] strings1 = Arrays.stream(strings)
        String strings1 = Arrays.stream(strings)//Stream API
                .map(Double::parseDouble)
                .map(Solution::matchRoundingRound)
                .collect(Collectors.joining(" "));
//              .toArray(String[]::new);

        fileOutputStream.write(strings1.getBytes()); //запись в файл
        fileInputStream.close();
        fileOutputStream.close();
    }


    public static String decimalFormat(double value) { //округление
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String result = decimalFormat.format(value);
        System.out.println((result));
        return result;
    }

    public static String stringFormat(double value) {

        String result = String.format("%2.0f", value);
        System.out.format("%5.2f => %2.0f%n", value, value);
        return result;
    }

    public static String matchRounding(double value) {
        Math.ceil(value);
        String result = String.format("%2.0f", Math.floor(value));
        System.out.format("%5.2f => %2.0f%n", value, Math.floor(value));
        return result;
    }

    public static String matchRoundingRound(double value) {
        Math.ceil(value);
        String result = String.format("%d", Math.round(value));
//        System.out.format("%5.2f => %2d%n", value, Math.round(value)); //форматирование строк String.format
        return result;
    } //округление

}
 /*
          3.49 => 3
          3.50 => 4
          3.51 => 4
         -3.49 => -3
         -3.50 => -3
         -3.51 => -4
        */


/*

 FileInputStream fileInputStream = new FileInputStream(path1); // файл для чтения
byte[] buf = new byte[fileInputStream.available()]; // создаем массив байт по размеру файла
fileInputStream.read(buf); // читаем весь файл
fileInputStream.close(); // закрываем InputStream

String result = Arrays.stream(new String(buf).split("\\s+")) // помещаем массив байт в строку, разбиваем ее по любому набору пустых символов и помещаем в stream
        .map(value -> String.valueOf(Math.round(Double.parseDouble(value)))) // парсим дробное число, и округляем (round - возвращает long, специальное его приводить не нужно)
        .collect(Collectors.joining(" ")); // соединяем подготовленные строки

FileOutputStream fileOutputStream = new FileOutputStream(path2); // файл для записи
fileOutputStream.write(result.getBytes()); // из строки результата получаем массив байт и сохраняем за один раз в файл
fileOutputStream.close(); // закрываем OutputStream

 */