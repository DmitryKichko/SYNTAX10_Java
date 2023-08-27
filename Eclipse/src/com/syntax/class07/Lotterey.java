package com.syntax.class07;

import java.util.Scanner;

public class Lotterey {

	public static void main(String[] args) {
	
		/*
		 * у нас есть секретное число (любое число от 1 до 20)
		 * просим пользователя угадать свое секретное число 
		 * продолжаем угадывать число до тех пор, пока пользователь не введет свой секретный номер 
		 * после угадывания говорим "Поздравляем!
		 */
		
		Scanner in;
		int secretNumber, userNumber;
		secretNumber=15;
		
		in = new Scanner(System.in);
		
		do {
		System.out.println("Пожалуйста, угадайте мой секретный номер из диапазона от 1 до 20");
		userNumber=in.nextInt();
		}while(userNumber!=secretNumber);
		
		System.out.println("Поздравляю, вы получили его");
	}

}
