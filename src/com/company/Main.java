package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 87236432;   // int - для чисел
        String s = "6432";   // String - для букв
/*
        final int age;       //объявление переменной     final - не дает иенять значение
        age = 47;          // инициализация
*/
/*
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        boolean opened = true;

        if (age < 30) {
            System.out.println("isnt opened");
        } else if (age < 10 || age > 30) {      //      || - условный оператор "или" , && - условный оператор "и"
            System.out.println("its opened");
        } else {
            System.out.println("end");
        }

    }
*/


    }

    public static void gotovitEdu() {                // метод без входящих параметров
        System.out.println("нарезано");
        System.out.println("сварили");
        System.out.println("Накрыли стол");
    }

    public static void callSomeBody(String name) {          // метод с входящим параметром
        System.out.println("Позовите " + name);
    }

    public static int kvagratChisla(int number, int number2) {          // возвращаемый метод
        int result = number * number2;
        return result;
    }


}
