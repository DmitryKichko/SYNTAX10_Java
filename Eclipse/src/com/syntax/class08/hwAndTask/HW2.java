package com.syntax.class08.hwAndTask;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		/*
		 * Попросить пользователя заплатить за конфету
		 *
		 * - Продолжать просить пользователя заплатить за конфету до тех пор,
		 * пока введенная цена не станет равной 3
		 *
		 * - если введенное значение больше 3 -->, пожалуйста, дайте меньше денег
		 * в противном случае -->, пожалуйста, дайте денег
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
	}

}
