package com.syntax.class05;

import java.util.Scanner;

public class IntializeVariableBetterWay {

	public static void main(String[] args) {

		/*
		 * Попросить пользователя ввести 3 числа и найти наибольшее из них
		 */

		Scanner scan;
		int num1, num2, num3, largest;

		scan = new Scanner(System.in);
		System.out.println("Пожалуйста, введите 3 цифры");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num1 && num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		System.out.println("наибольшее число " + largest);

		// Определим, является ли наибольшая величина четной или нечетной

		if (largest%2!=0) {
			System.out.println(largest+" число четное");
		}else {
			System.out.println(largest+" число нечётное");
		}
		
	}

}
