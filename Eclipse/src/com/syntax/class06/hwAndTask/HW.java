package com.syntax.class06.hwAndTask;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {

		
		/*
		 * Напишите программу, которая будет считывать три входных данных:
		 *
		 * - контрольная работа
		 * - промежуточные
		 * - итоговые оценки
		 *
		 * Затем необходимо определить оценку на основе следующих правил:
		 *
		 * - если средний балл >= 90 -> оценка = A
		 * - если средний балл >= 70 и <90 -> оценка = B
		 * - если средний балл >= 50 и <70 -> оценка = C
		 * - если средний балл < 50 -> оценка = F
		 */

		Scanner scan;
		int quiz, midterm, overall, average;
		char grade;

		scan = new Scanner(System.in);
		System.out.println("Введите оценку за контрольную работу");
		quiz = scan.nextInt();
		System.out.println("Введите промежуточную оценку");
		midterm = scan.nextInt();
		System.out.println("Введите итоговую оценку");
		overall = scan.nextInt();

		average = (quiz + midterm + overall) / 3;

		if (average >= 90) {
			grade = 'A';

		} else if (average >= 70 && average < 90) {
			grade = 'B';

		} else if (average >= 50 && average < 70) {
			grade = 'C';

		} else {
			grade = 'F';
		}

		System.out.println("Со средним баллом = " + average + " Ваша оценка " + grade);
	}
}
