package com.syntax.class08.hwAndTask;

import java.util.Scanner;

public class LastTask {

    public static void main(String[] args) {
        /*
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

        Scanner scan;
        String item;
        double price, money, total = 0, change;

        scan = new Scanner(System.in);
        System.out.println("Какой товар Вы хотите приобрести?");
        item = scan.nextLine();

        System.out.println("Какова цена товара?");
        price = scan.nextDouble();


        do {

            System.out.println("Пожалуйста, оплатите товар");
            money = scan.nextDouble();

            total += money;

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
