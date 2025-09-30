package com.syntax.class05;

import java.util.Scanner;

public class NestedIfRecap {

	public static void main(String[] args) {
		
		/*
		 * Написать программу, спрашивающую, получил ли пользователь визу:
		 *
		 * Если пользователь получил визу, то спрашиваем, на какой срок выдана виза
		 * если срок действия визы больше 1 года --> здорово
		 * Если меньше --> придется возвращаться через 1 год и подавать документы заново
		 */
		
		Scanner scan;
		String visa;
		int years;

		scan = new Scanner(System.in);
		System.out.println("Вы получили визу?");

		visa = scan.next();

		if (visa.equals("Да") || visa.equals("да")) {

			System.out.println("Поздравляю, на какой срок выдана виза");

			years = scan.nextInt();

			if (years > 1) {
				System.out.println("это потрясающе");
			} else {
				System.out.println("Вам придется вернуться через 1 год и снова подать заявление");
			}
		}

	}
}
