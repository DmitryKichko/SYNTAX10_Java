package com.syntax.class08.hwAndTask;

import java.util.Scanner;

public class AllHwAndTask08 {

    public static void main(String[] args) {

        /**
         *  Найдите сумму четных и нечетных чисел от 1 до 100
         */

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Сумма не четных чисел: " + sumOdd);

        /**
         * Попросить пользователя заплатить за конфету
         *
         * - Продолжать просить пользователя заплатить за конфету до тех пор,
         * пока введенная цена не станет равной 3
         *
         * - если введенное значение больше 3 -->, пожалуйста, дайте меньше денег
         * в противном случае -->, пожалуйста, дайте больше денег
         *
         * - после того как пользователь получил введенную сумму,
         * выведите: "Пожалуйста, наслаждайтесь своими конфетами"
         */

        Scanner in = new Scanner(System.in);
        int money;
        System.out.println("Пожалуйста, оплатите свои конфеты");

        do {

            money = in.nextInt();

            if (money > 3) {
                System.out.println("Пожалуйста, дайте меньше денег");
            } else if (money < 3) {
                System.out.println("Пожалуйста, дайте больше денег");
            }
        } while (money != 3);

        System.out.println("Пожалуйста, наслаждайтесь своими конфетами");

        /**
         * Вывести все числа от 1 до 10, кроме чисел 5 и 9
         */

        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 9) {
                continue;
            }
            System.out.print(i + " ");
        }

        /**
         * Напечатать числа от 1 до 50, за исключением тех, которые делятся на 3
         */

        for (int i = 1; i <= 50; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }

        /**
         * Создать программу:
         *
         * - Которая будет просить пользователя подать заявку на получение кредитной карты.
         *
         * - Как только пользователь получает ответ "Да"
         * программа должна прекратить запрос
         */

        Scanner scan = new Scanner(System.in);
        String credit;

        do {
            System.out.println("Вы хотите оформить кредитную карту?");
            credit = scan.next();
            if (credit.equalsIgnoreCase("Да")) {
                break;
            }
        } while (true);

        System.out.println("Поздравляем с выбором кредитной карты!");

        /**
         * Напишите программу:
         *
         * - Которая считывает диапазон целых чисел из (начальная и конечная точка)
         *   предоставленный пользователем и затем из этого диапазона печатает
         *   сумму четных и нечетных целых чисел
         *
         */

        Scanner scan1;
        int start, end, evenSum = 0, oddSum = 0;

        scan1 = new Scanner(System.in);
        System.out.println("Пожалуйста, введите начальное целое число");
        start = scan1.nextInt();
        System.out.println("Пожалуйста, введите конечное целое число");
        end = scan1.nextInt();

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Сумма четных чисел из диапазона " + start + " до " + end + " равно " + evenSum);
        System.out.println("Сумма четных чисел из диапазона " + start + " до " + end + " равно " + oddSum);

        /**
         * Написать программу:
         *
         * - Которая просит пользователя ввести товар,
         *   который он хочет купить, и цену на этот товар.
         *
         * - Каждый раз, когда пользователь вводит деньги, накапливает их сумму -> сообщать
         *   пользователю, сколько осталось до погашения.
         *
         * - Если пользователь вводит больше денег, программа должна возвращать сдачу.
         *
         * - По окончании оплаты программа должна сказать: "Спасибо за покупку!"
         *
         */

        Scanner scan2;
        String item;
        double price, money1, total = 0, change;

        scan2 = new Scanner(System.in);
        System.out.println("Какой товар Вы хотите приобрести?");
        item = scan2.nextLine();

        System.out.println("Какова цена товара?");
        price = scan2.nextDouble();


        do {

            System.out.println("Пожалуйста, оплатите товар");
            money1 = scan2.nextDouble();

            total += money1;

            if (total > price) {
                change = total - price;
                System.out.println("Вот ваша сдача: " + change);
                break;

            } else if (total < price) {

                System.out.println("Пожалуйста, дайте больше: " + (price - total));

            } else {
                System.out.println("Именно такая сумма");
            }
        } while (total != price);
        System.out.println("Спасибо за покупку");

    }
}
