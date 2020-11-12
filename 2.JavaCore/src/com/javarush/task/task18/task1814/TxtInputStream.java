package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {


    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
//        String[] arrS = fileName.split("\\.");
//        if (!arrS[arrS.length - 1].equals("txt")) {
        if (!fileName.endsWith("txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}


/*if (!file.matches(".*\\.txt$")){

метод matches возвращает true если совпадение есть,  и false если нет.
if (!file.matches("тут описываем регулярное выражение")){
.*\\.txt$"

.* - "." Точка обозначает любой символ(буквы,цифра и всё-что угодно).
 Дальше идёт число повторений "*". * Это сколько угодно раз. Любой символ (.) сколько угодно раз(*)
\\. - \\ указывают на то, что ищем именно СИМВОЛ точки ".".
дальше идут буквы txt
$ - обозначает конец строки.
Всё вместе:
В начале строки может быть сколько угодно символов (".*"), пока не встретится точка ("\\.").
После точки должны быть символы txt,
но они должны быть именно в конце ("$")*/