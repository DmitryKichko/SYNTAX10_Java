package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		
		for(int i=0; i<=3; i++) {
			
			if (i==1) {  // continue пропускает выполнение дальше i==1, то есть не будет печатать 
				continue;
			}
			System.out.println("Я нахожусь внутри цикла");
			System.out.println(i);
		}
		System.out.println("------------------------------------");
		//Я хочу вывести все числа от 1 до 10, кроме чисел 5 и 9

		for(int i=1; i<=10; i++) {
			if (i==5 || i==9) {
				continue;
			}
		
		System.out.println(i+" ");
		
	}
	}
}
