package com.syntax.class04;


import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[] args) {

	// Сравнить 2 числа через сканер и определить, какое из них больше, а какое меньше
		
		Scanner data = new Scanner(System.in);
		
		System.out.println("Пожалуйста, введите первое число");
		int num1 = data.nextInt();
		
		System.out.println("Пожалуйста, введите второе число");
		int num2 = data.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " больше, чем " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " меньше, чем " + num2);
		} else {
			System.out.println(num1 + " равен " + num2);
		}
		
	}
}
