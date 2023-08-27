package com.syntax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {

		/*
		 * Я хочу распечатать таблицу умножения
		 * 
		 * 1X1=1; 1X2=2; ...... 1X10=10
		 */

		int num = 1;

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " X " + i + " = " + num * i);
		}

		System.out.println("Что является выходной информацией?");

		int sum = 0;
		for (int i = 1; i <= 5; i++) {

			sum = sum + i;
		}
		System.out.println(sum);

		System.out.println("Что является выходной информацией?");

		sum = 0;

		for (int i = 0; i <= 40; i += 10) {
			sum += i;

		}

		System.out.println(sum);

		System.out.println("Что является выходной информацией?");

		int total = 1;

		for (int i = 1; i < 10; i++) {
			total *= i;
		}

		System.out.println(total);

		/* 
		 * Задача HW
		 *  
		 * Найдите сумму четных и нечетных чисел от 1 до 100
		 */
		
		/*
		 * Попросить пользователя заплатить за конфету
		 * Продолжать просить пользователя заплатить за конфету до тех пор, пока введенная цена не станет равной 3
		 * 
		 * если введенное значение больше 3 --> пожалуйста, дайте меньше денег
		 * в противном случае --> пожалуйста, дайте денег
		 * 
		 * после того, как пользователь получил введенную сумму, выведите "Пожалуйста, наслаждайтесь своими конфетами"
		 */

	}

}
