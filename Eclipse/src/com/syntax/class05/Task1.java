package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Предложите пользователю ввести рост человека в дюймах. Человек должен быть
		 * отнести к одному из следующих типов: 
		 * низкий (менее 60 дюймов) 
		 * средний (между 60-72 дюйма)
		 * высокий (более 72 дюймов)
		 */

		Scanner variable = new Scanner(System.in);
		System.out.println("Пожалуйста, укажите рост человека в дюймах");
		int height = variable.nextInt();
		if (height < 60) {
			System.out.println("Низкий");
		}else if (height >= 60 && height < 72) {
			System.out.println("Средний");
		}else if (height > 72) {
			System.out.println("Высокий");
		}
	}

}
