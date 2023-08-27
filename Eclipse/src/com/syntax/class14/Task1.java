package com.syntax.class14;

public class Task1 {

	// создать метод, который будет принимать 2 параметра в виде числа и выводить, какое число больше.
	
	void printGreater(int num1,int num2) {
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	//Создадим метод, который будет принимать число и выводить
	//является ли число четным или нечетным.
	
	void printOdd(int number) {
		
		if(number%2==0) {
			System.out.println("Число четное");
		}else {
			System.out.println("Число не четное");
		}
	}
	
	
	
}
