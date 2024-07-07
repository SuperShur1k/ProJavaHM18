package org.example.lesson18.hmls18;

//Напишите метод extractUrlFromLink(String) выкусывающий url из ссылки html
//
//
//
//System.out.println(extractUrlFromLink("link")); // https://www.goolge.com/
//        System.out.println(extractUrlFromLink("file on ftp")); // ftp://ftp.ya

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task6 {
    public static void main(String[] args) {
        System.out.println(extractUrlFromLink("<a href=\"https://www.google.com/\">link</a>"));
        System.out.println(extractUrlFromLink("<a href=\"ftp://ftp.ya\">file on ftp</a>"));
    }

    public static String extractUrlFromLink(String link) {
        String regex = "href\\s*=\\s*\"([^\"]*)\"";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(link);

        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
