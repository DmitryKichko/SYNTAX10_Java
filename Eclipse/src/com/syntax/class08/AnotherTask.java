package com.syntax.class08;

import java.util.Scanner;

public class AnotherTask {

	public static void main(String[] args) {
		
		/*
		 * Напишите программу, которая считывает диапазон целых чисел из (начальная и конечная точка)
		 * предоставленный пользователем
		 * и затем из этого диапазона печатает сумму четных и нечетных целых чисел
		 */

		Scanner scan;
		int start, end, evenSum = 0, oddSum = 0;
		
		scan=new Scanner(System.in);
		System.out.println("Пожалуйста, введите начальное целое число");
		start=scan.nextInt();
		System.out.println("Пожалуйста, введите конечное целое число");
		end=scan.nextInt();
		
		for (int i=start; i<=end; i++) {
			
			if (i%2==0) {
				evenSum+=i;
			}else {
				oddSum+=i;
			}
		}
		
		System.out.println("Сумма четных чисел из диапазона "+start+" до "+end + " равно "+evenSum);
		System.out.println("Сумма четных чисел из диапазона "+start+" до "+end + " равно "+oddSum);
	}

}
