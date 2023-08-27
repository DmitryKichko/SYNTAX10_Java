package com.syntax.class07;

public class Task {

	public static void main(String[] args) {

		/*
		 * Печать четных чисел от 20 до 100
		 */

		int j = 20;

		while (j <= 100) {
			System.out.println(j+" ");
			j += 2;//j=j+2;

		}
		
		System.out.println("     -------------------------------      ");
		
		j = 20;

		while (j <= 100) {
			if (j % 2 == 0) {
				System.out.println(j+" ");
			}

			j++;

		}
		
		/*
		 * 1) Вывести числа от 1 до 100 в 1 строку через пробел
		 * 2) Вывести числа от 100 до 1
		 * 3) Вывести четные числа от 20 до 100
		 * 4) Вывести единственное нечетное число от 100 до 1
		 */

	}
}
