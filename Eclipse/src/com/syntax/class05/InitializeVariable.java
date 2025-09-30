package com.syntax.class05;

import java.util.Scanner;

public class InitializeVariable {
	
	// Для того чтобы создать main - метод, нужно написать main затем нажать control + space 

	public static void main(String[] args) {

		/*
		 * Попросить пользователя ввести 3 числа и найти наибольшее из них
		 */

		Scanner scan;
		int num1, num2, num3;

		scan = new Scanner(System.in);
		System.out.println("Пожалуйста, введите 3 числа по порядку");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 == num2 && num1 == num3) {
			System.out.println("Все числа равны");
		} else {

			if (num1 > num2 && num1 > num3) {
				System.out.println(num1 + " - наибольшее число");
			} else if (num2 >= num1 && num2 >= num3) {
				System.out.println(num2 + " - наибольшее число");
			} else if (num3 >= num1 && num3 >= num2) {
				System.out.println(num3 + " - наибольшее число");
			}
		}

		// Определим, является ли наибольшая величина четной или нечетной

	}
}
