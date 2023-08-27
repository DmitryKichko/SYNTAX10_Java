package com.syntax.class06;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		/*
		 * С помощью сканера класса создать калькулятор. Разрешить
		 * пользователю вводить 2 числа и оператор (+,-,*,/).
		 * На основе оператора выдавать пользователю результат.
		 * Выполните это задание двумя способами:
		 * используя оператор if и switch case.
		 */
		
	
		Scanner scan = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		char operator;
		
		
		
		System.out.println("Введите первое число");
		
		num1 = scan.nextDouble();
		
		System.out.println("Введите один из операторов + или - или * или /");
		
		operator = scan.next().charAt(0);
		
        System.out.println("Введите второе число");
		
		num1 = scan.nextDouble();
		
		double result1 = 0;
		double result2 = 0;
		double result3 = 0; 
		double result4 = 0; 
		
		if (operator == '+') {
			result1 = num1+num2; 
			System.out.println(result1);	
		}else if(operator == '*') {
			result2 = num1*num2;
			System.out.println(result2);
		}else if(operator == '/') {
			result3 = num1/num2;
			System.out.println(result3);
		}else if(operator == '-') {
			result4 = num1-num2; 
			System.out.println(result4);
			
		}else {
			System.out.println("выбран не верный оператор");
		}
		}
	}

