package com.syntax.class05.hwAndTask;

import java.util.Scanner;

public class Task2 {
	
	/*
	 * Напишите программу, которая будет выводить:
	 *
	 * Является ли день выходным или будним:
	 *
	 * Если день от 1-5 -> выводится: "Это будний день",
	 * Если день от 6-7 -> выводится: "Это выходной день",
	 * Любой другой день -> выводится: "Неверный день".
	 */

	public static void main(String[] args) {
		
		Scanner variable = new Scanner(System.in);
		System.out.println("Пожалуйста выберите день, введите число от 1-7");
		int day = variable.nextInt();
		
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("Это будний день");
		} else if (day == 6 || day == 7) {
			System.out.println("Это выходной день");
		} else {
			System.out.println("Указан неправильный день");
		}
		
		System.out.println("----------------------------------------");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Введите день недели");
		int days = input.nextInt();
		
		if (days >= 1 && days < 6) {
			System.out.println("Это будний день");
		} else if (days == 6 || days == 7) {
			System.out.println("Это выходной день");
		} else {
			System.out.println("Неправильный день");
		}

	}
}
