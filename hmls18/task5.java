package org.example.lesson18.hmls18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//То же что и в пункте 4, но еще и с учетом високосности и правильного количества дней в месяцах

public class task5 {
        public static void main(String[] args) {
            System.out.println(isDate("24 jan 2001")); // true
            System.out.println(isDate("31 feb 2020")); // false
            System.out.println(isDate("15 mar 2021")); // true
        }

        public static boolean isDate(String date) {
            String regex = "^(\\d{1,2}) (jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec) (\\d{4})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(date);

            if (!matcher.matches()) {
                return false;
            }

            int day = Integer.parseInt(matcher.group(1));
            String month = matcher.group(2).toLowerCase();
            int year = Integer.parseInt(matcher.group(3));

            int maxDays;
            switch (month) {
                case "jan": case "mar": case "may": case "jul":
                case "aug": case "oct": case "dec":
                    maxDays = 31;
                    break;
                case "apr": case "jun": case "sep": case "nov":
                    maxDays = 30;
                    break;
                case "feb":
                    maxDays = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
                    break;
                default:
                    return false;
            }

            return day >= 1 && day <= maxDays;
        }
}
