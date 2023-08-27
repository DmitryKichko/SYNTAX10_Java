package com.syntax.class06;

import java.util.Scanner;

public class HW2 {
	
	public static void main(String[] args) {
		
		/*
		 * Написать программу, в которой пользователь должен ввести месяц своего рождения.
		 * На основании месяца определить сезон.
		 * Пример: если пользователь родился в Июне, Июле, Августе -> Сезон = "Лето".
		 * В конце работы программы мы должны увидеть вывод "Вы родились в сезон ______". 
		 */
		
		
		int birthday;
		Scanner scan;
		String month;
		
		scan = new Scanner (System.in);
		
		System.out.println("Пожалуйста ввеите месяц своего рождения (от 1-12) "
				+ "и мы вам скажем какой это сезон года");
		
		birthday = scan.nextInt();
		
		if (birthday>=6 && birthday<=8) {
			System.out.println("Это Лето");
		}else if (birthday>=1 && birthday<=5) {
			System.out.println("Это зима");
		}
		
		
		
	}

}
