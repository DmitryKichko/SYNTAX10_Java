package com.syntax.class06.hwAndTask;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {

		Scanner s;
		int num1, num2, num3, largest;
		s = new Scanner(System.in);
		System.out.println("Пожалуйста, введите три разных числа");
		num1 = s.nextInt();
		num2 = s.nextInt();
		num3 = s.nextInt();

		if (!(num1 == num2 && num2 == num3)) {


			if (num1 > num2) { // предполагая, что num1 больше, чем num2. (num1 > num2)

				if (num1 > num3) {
					largest = num1;
				} else { // ищем, что num3 больше, чем num1. (num3 > num1)
					largest = num3;
				}

			} else { // num2 больше, чем num1. (num2 > num1)
				if (num2 > num3) {
					largest = num2;
				} else { // ищем, что num3 больше, чем num2. (num3 > num2)
					largest = num3;
				}
			}
			System.out.println("Наибольшее число " + largest);
		}

	}
}
