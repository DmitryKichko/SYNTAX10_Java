package com.syntax.class04;

//shortcut to import: mac --> cmd+shift+o    windows --> ctrl+shift+o  
import java.util.Scanner;

public class ExampleOFScanner {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in); //создание сканера  
		
		System.out.println("Пожалуйста, введите ваше имя"); 
		String name=scan.nextLine(); //захват строкового значения
		
		System.out.println("Привет "+name);
		
		//захват целочисленного значения
		System.out.println("Пожалуйста, введите свой возраст");
		int age=scan.nextInt();
		System.out.println(name+" "+age+" лет");
	}
}
