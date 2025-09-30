package com.syntax.class04;

// Автоматический импорт: mac --> OPTION + ENTER    windows --> ALT + ENTER


import java.util.Scanner;

public class ExampleOFScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // Создание сканера
		
		System.out.println("Пожалуйста, введите ваше имя"); 
		String name = scan.nextLine(); // Захват строкового значения
		
		System.out.println("Привет " + name);

		//захват целочисленного значения
		System.out.println("Пожалуйста, введите свой возраст");
		int age = scan.nextInt();
		
		System.out.println(name + " " + age + " лет");

	}
}
