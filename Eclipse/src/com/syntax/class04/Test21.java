package com.syntax.class04;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Пожалуйста выберите первое число");
		int num1 = scan.nextInt();
		System.out.println("Ваше первое число "+num1);
		
		System.out.println("Пожалуйста выберите второе число");
		
		int num2 = scan.nextInt();
		System.out.println("Ваше второе число "+num2);
		
		System.out.println("Сравним ваши числа");
		
		if (num1>num2) {
			System.out.println("Первое число больше второго");
		}else if(num1<num2) {
			System.out.println("Первое число меньше второго");
		}else {
			System.out.println("Ваши числа равны");
		}
		
		System.out.println("конец вашего кода");
		

}
}