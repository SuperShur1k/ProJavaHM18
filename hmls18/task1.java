package org.example.lesson18.hmls18;

import java.util.Arrays;

//Дана строка "michael;levanov|34|34000"
//Разбейте ее по резделителям (;|) и распечатайте составные части

public class task1 {
    public static void main(String[] args) {
        String line = "michael;levanov|34|34000";
        System.out.println(Arrays.toString(line.split("[;|]")));
    }
}
