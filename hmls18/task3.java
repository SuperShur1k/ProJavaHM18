package org.example.lesson18.hmls18;

//Напишите метод isGoodPassword(String) проверяющий пароль на "хорошесть"
//Хороший пароль длиной не менее 8 символов, содержит как минимум одну цифру и как минимум один знак из набора !@%#^&$|
//В методе можно написать несколько проверок

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println(isGoodPassword("abc123"));       // false
        System.out.println(isGoodPassword("abc123$"));      // true
        System.out.println(isGoodPassword("12345678"));     // false
        System.out.println(isGoodPassword("password!1"));   // true

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an password: ");
        String password = sc.nextLine();
        if (isGoodPassword(password)) {
            System.out.println("You have successfully logged in!");
        }else {
            System.out.println("You have unsuccessfully logged in!");
        }
    }
    
    public static boolean isGoodPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialChars = "!@%#^&$|";

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialChars.indexOf(c) != -1) {
                hasSpecialChar = true;
            }
        }
        return hasDigit && hasSpecialChar;
    }
}
