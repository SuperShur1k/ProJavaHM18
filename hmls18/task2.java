package org.example.lesson18.hmls18;

//В строке "Today's temperature is 18 degrees centigrade, yesterday it was 14"
//Замените все чиcла на 21 и замените centi на multi

public class task2 {
    public static void main(String[] args) {
        String str = "Today's temperature is 18 degrees centigrade, yesterday it was 14";
        System.out.println(str.replaceAll("\\d+", "21").replaceAll("centi", "multi"));
    }
}
