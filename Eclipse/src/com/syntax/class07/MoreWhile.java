package com.syntax.class07;

import java.util.Scanner;

public class MoreWhile {

	public static void main(String[] args) {
		
		/*
		 *  Запросить у пользователя имя и возраст 3 раза
		 * Вывести имя+возраст
		 */
		
		Scanner scan;
		
		String name;
		int age;
		
		scan=new Scanner(System.in);
		
		int i=1;
		
		while (i<=3) {
		
		System.out.println("Пожалуйста, введите ваше имя");
		name=scan.next();
		
		System.out.println(name + " пожалуйста, укажите ваш возраст");
		age=scan.nextInt();
		
		System.out.println(name + " это "+ age + " лет");
		i++;
		
		}
	}
}
