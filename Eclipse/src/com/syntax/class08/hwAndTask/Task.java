package com.syntax.class08.hwAndTask;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        /*
         * Напечатать числа от 1 до 50, за исключением тех, которые делятся на 3
         */

        System.out.println("------------------------------- TASK 1 -------------------------------");

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i + " ");

        }

        /*
         * Создать программу:
         *
         * - Которая будет просить пользователя подать заявку на получение кредитной карты.
         *
         * - Как только пользователь получает ответ "Да"
         *   программа должна прекратить запрос
         */

        System.out.println("------------------------------- TASK 2 -------------------------------");

        Scanner scan = new Scanner(System.in);
        String credit;

        do {
            System.out.println("Вы хотите оформить кредитную карту?");
            credit = scan.next();
            if (credit.equalsIgnoreCase("Да")) {   // .equalsIgnoreCase - для того чтобы сравнивать и игнорировать регистр
                break;                                        // Для того чтобы можно вводить: Да/ДА/да
            }
        } while (true);

        System.out.println("Поздравляем с выбором кредитной карты!");


    }
}
