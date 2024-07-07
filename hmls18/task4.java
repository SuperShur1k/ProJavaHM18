package org.example.lesson18.hmls18;

//Напишите метод isDate(String) который проверит, что передаваемая строка является датой
//Дата выглядит как "24 jan 2001" - день месяца, месяц и год
//Месяцы могут быть только jan, feb, mar и тп

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        System.out.println(isDate("24 jan 2001"));
        System.out.println(isDate("15 mai 2020"));
        System.out.println(isDate("15 mar 2021"));
    }

    public static boolean isDate(String date) {
        String regex = "^\\d{1,2} (jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec) \\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
}
