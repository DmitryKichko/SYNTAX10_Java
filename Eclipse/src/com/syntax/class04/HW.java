package com.syntax.class04;

public class HW {
	public static void main(String[] args) {

		/*
		 * Написать программу, проверяющую, является ли число положительным или отрицательным.
		 */

		int number = 0;

		if (number > 0) {
			System.out.println(number + " положительное число");
		} else if (number < 0) {
			System.out.println(number + " отрицательное число");
		} else {
			System.out.println("Ваш номер " + number);
		}

		/*
		 * Написать Java-программу для проверки четности или нечетности числа.
		 */

		int evenOdd = 16;

		if (evenOdd % 2 == 0) {
			System.out.println(evenOdd + " четное число");
		} else {
			System.out.println(evenOdd + " нечетное число");
		}

		/*
		 * пример reminder (напоминание)
		 */

		int i = 10 / 3; 
		System.out.println(i); //3
		
		int mod=10%3;
		System.out.println(mod); //1
		
	}
}
