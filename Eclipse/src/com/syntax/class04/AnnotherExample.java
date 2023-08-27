package com.syntax.class04;

import java.util.Scanner;
// shorting to import: mac --> cmd+shift+o     windows --> ctrl+shift+o
public class AnnotherExample {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Пожалуйста, укажите город");
		String city=input.nextLine(); // захват строкового значения и необходимость нажать клавишу Enter
		
		System.out.println("Пожалуйста, укажите температуру в вашем городе");
		double temp=input.nextDouble(); // захват двойного значения и необходимость нажать клавишу Enter
		
		System.out.println("Это "+temp+" в "+city);
		
		
		
	}
}
