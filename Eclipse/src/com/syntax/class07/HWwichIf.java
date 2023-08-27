package com.syntax.class07;

import java.util.Scanner;

public class HWwichIf {

	public static void main(String[] args) {
		
		/*
		 * С помощью сканера класса создать калькулятор. Разрешить
		 * пользователю вводить 2 числа и оператор (+,-,*,/).
		 * На основе оператора выдавать пользователю результат.
		 * Выполните это задание двумя способами:
		 * используя оператор if.
		 */
		
		Scanner scan = new Scanner(System.in);
		double x, y, result = 0;
		char operator;
		String operation = null;
		System.out.println("Введите первое число");
		x = scan.nextDouble();
		System.out.println("Введите арифметический оператор + или - или * или /");
		operator = scan.next().charAt(0);
		System.out.println("Введите второе число");
		y = scan.nextDouble();
		//if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			if (operator == '+') {
				result = x + y;
				operation = "добавление";
			} else if (operator == '-') {
				result = x - y;
				operation = "вычетание";
			} else if (operator == '*') {
				result = x * y;
				operation = "умножение";	
			} else if (operator == '/') {
				result = x / y;
				operation = "деление";
				
			}else {
				System.out.println("Неправильный арифметический оператор");
			}
			
			System.out.println("Результат" + operation + " " + x + " и "+ y + " is "+ result );
		//}
	
		
	}	
	}

