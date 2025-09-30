package com.syntax.class07.hwAndTask;

import java.util.Scanner;

public class AllHwAndTask07 {

    public static void main(String[] args) {

        /**
         * С помощью оператора switch и сканера создать калькулятор:
         *
         * - Разрешить пользователю вводить 2 числа и оператор (+,-,*,/).
         *
         * - На основе оператора выдавать пользователю результат.
         *
         * Выполните это задание используя оператор switch case.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите два разных числа");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result;
        System.out.println("Пожалуйста, введите один из операторов для вычисления: +, -, *, /");
        String operator = scan.next();

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                result = 0;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);


        /**
         *  Напечатать - "привет" 4 раза
         */

        int a = 1;

        while (a <= 4) {
            System.out.println("Здравствуйте");
            a++;  // - Инкремент
        }


        /**
         *  Напечатать "Как дела" - 10 раз
         */

        int i = 0;

        while (i < 10) {
            System.out.println(i + ")" + " - " + "Как дела");
            i++;
        }

        /**
         *  Напечатать числа от 1 до 20
         */

        int b = 1;

        while (b <= 20) {
            System.out.println(b);
            b++;
        }

        /**
         *  Напечатать числа от 100 до 110
         */

        int var = 100;

        while (var <= 110) {
            System.out.print(var + " ");
            var++;
        }

        /**
         *  Напечатать числа от 100 до 110
         */

        int num = 10;

        while (num >= 1) {
            System.out.print(num + " ");
            num--;
        }

        /**
         *  Вывести нечетные числа от 1 до 20
         */

        int n = 1;

        while (n < 21) {
            System.out.println(n);
            n += 2;
        }

        /**
         *  Вывести нечетные числа от 1 до 20, используя оператор if
         */

        n = 1;

        while (n < 21) {
            if (n % 2 != 0) {
                System.out.println(n);
            }
            n++;
        }

        /**
         *  Вывести четные числа от 20 до 100
         */

        int j = 20;

        while (j <= 100) {
            System.out.println(j + " ");
            j += 2;      //j=j+2;
        }


        /**
         *  Вывести числа от 20 до 100
         */

        int f = 20;

        while (f <= 100) {
            System.out.println(f + " ");
            f += 2;      //j=j+2;

        }

        f = 20;

        while (f <= 100) {
            if (f % 2 == 0) {
                System.out.println(f + " ");
            }
            f++;
        }


        /**
         * Запросить у пользователя имя и возраст 3 раза
         *
         * Вывести имя + возраст
         */

        Scanner scan1;

        String name;
        int age;

        scan1 = new Scanner(System.in);

        int g = 1;

        while (g <= 3) {

            System.out.println("Пожалуйста, введите ваше имя");
            name = scan1.next();

            System.out.println(name + " пожалуйста, укажите ваш возраст");
            age = scan1.nextInt();

            System.out.println(name + " вам " + age + " лет");
            g++;

        }

        /**
         * Вывести числа от 1 до 10 с помощью цикла do while
         */

        int с = 1;

        do {
            System.out.println(с);
            с++;
        } while (с <= 10);

        /**
         * Есть секретное число (любое число от 1 до 20).
         * Просим пользователя угадать свое секретное число:
         *
         * - продолжаем угадывать число до тех пор, пока пользователь не введет свой секретный номер
         * - после угадывания говорим: "Поздравляем!"
         */

        Scanner in;
        int secretNumber, userNumber;
        secretNumber = 15;

        in = new Scanner(System.in);

        do {
            System.out.println("Пожалуйста, угадайте секретный номер из диапазона от 1 до 20");
            userNumber = in.nextInt();
        } while (userNumber != secretNumber);

        System.out.println("Поздравляю, вы получили его");

        /**
         * Вывести "привет" 5 раз с помощью цикла for
         */

        for (int num11 = 1; num11 <= 5; num11++) {
            System.out.println("Привет");
        }

        /**
         * Вывести на печать числа ОТ 20 ДО 10 - с помощью цикла for
         */

        for (int num11 = 20; num11 >= 10; num11--) {
            System.out.println(num11 + " ");
        }

        /**
         * Вывести на печать четные числа ОТ 10 ДО 100 - с помощью цикла for
         */

        for (int num12 = 1; num12 <= 50; num12 += 10) {
            System.out.println(num12);
        }

        /**
         * Вывести на печать четные числа ОТ 10 ДО 100 - с помощью цикла for (увеличивая на 10)
         */

        for (int num13 = 0; num13 <= 50; num13 += 10) {
            System.out.println(num13);
        }

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

        Scanner inn = new Scanner(System.in);
        int money;
        System.out.println("Пожалуйста, оплатите свои конфеты");

        do {

            money = inn.nextInt();

            if (money > 3) {
                System.out.println("Пожалуйста, дайте меньше денег");
            } else if (money < 3) {
                System.out.println("Пожалуйста, дайте больше денег");
            }
        } while (money != 3);

        System.out.println("Пожалуйста, наслаждайтесь своими конфетами");



    }
}
