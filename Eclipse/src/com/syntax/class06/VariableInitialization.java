package com.syntax.class06;

import java.util.Scanner;

public class VariableInitialization {

	public static void main(String[] args) {

		/*
		 * Попросить пользователя ввести свое имя.
		 *
		 * В зависимости от возраста определить, кто является пользователем:
		 *
		 * если возраст от 0-3 лет --> ребенок
		 * если возраст от 3-6 лет --> малыш
		 * если возраст от 6-12 --> ребенок
		 * если возраст от 12-20 --> подросток
		 * если возраст от 20-65 --> взрослый
		 * если 65+ --> пожилой
		 */
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Пожалуйста, введите ваше имя");
		String name=in.nextLine();
		
		System.out.println("Пожалуйста, введите свой возраст");
		int age=in.nextInt();
		
		String whoAreYou = null; //
		
		if (age >= 0 && age < 3) {
			whoAreYou="Ребёнок";
		} else if (age >= 3 && age < 6) {
			whoAreYou="Малыш";
		} else if (age >= 6 && age < 13) {
			whoAreYou="Ребенок";
		} else if (age >= 13 && age < 20) {
			whoAreYou="Подросток";
		} else if (age >= 20 && age < 65) {
			whoAreYou="Взрослый";
		} else if (age > 65) {
			whoAreYou="Пожилой";
		} 
		
		if (whoAreYou != null) {
		System.out.println(name + ", вы - " + whoAreYou);
		} else {
			System.out.println("Возраст не может быть отрицательным");
		}

	}
}
