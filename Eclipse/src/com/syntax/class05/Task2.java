package com.syntax.class05;

import java.util.Scanner;

public class Task2 {
	
	/*
	 * Напишите программу, которая будет выводить: 
	 * является ли день выходной или будний. 
	 * Если любой день из 1-5 -> выводится "Это будний день",
	 * любой день из 6-7 -> вывести "Это выходной день",
	 * любой другой день -> выводится "Неверный день". 
	 */

	public static void main(String[] args) {
		
		
		Scanner variable= new Scanner(System.in);
		System.out.println("Пожалуйста, введите 1-7 дней");
		int day =variable.nextInt();
		
		if(day == 1 || day == 2 || day == 3 || day==4 || day == 5) {
			System.out.println("Это будний день");
		}else if (day == 6 || day == 7) {
			System.out.println("Это выходной день");
		}else {
			System.out.println("Неправильный день");
		}
		
		System.out.println("----------------------------------------");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Введите день недели");
		int days = input.nextInt();
		
		if (days >=1 && days<6) {
			System.out.println("Это будний день");
		} else if (days==6 || days == 7) {
			System.out.println("Это выходной день");
		} else {
			System.out.println("Неправильный день");
		}
		

	}

}
