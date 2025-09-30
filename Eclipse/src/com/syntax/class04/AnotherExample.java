package com.syntax.class04;

import java.util.Scanner;
public class AnotherExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Пожалуйста, укажите город");
		String city = input.nextLine(); // Захват строкового значения и необходимость нажать клавишу Enter
		
		System.out.println("Пожалуйста, укажите температуру в вашем городе");
		double temp = input.nextDouble(); // Захват двойного значения и необходимость нажать клавишу Enter
		
		System.out.println("Это " + temp + " в " + city);

	}
}
