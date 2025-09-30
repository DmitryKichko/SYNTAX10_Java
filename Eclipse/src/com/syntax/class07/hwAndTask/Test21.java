package com.syntax.class07.hwAndTask;


public class Test21 {

	public static void main(String[] args) {
		
		
		/*
		 * Я хочу распечатать таблицу умножения
		 * 
		 * 1X1=1; 1X2=2; ...... 1X10=10
		 */
		
		int num = 3;
		
		
		for (int i = 1; i<=10; i++) {
			
			System.out.println(num + "*" + i + "=" + num * i);
			
		}
		
		System.out.println("Что будет на выходе? ");
		
		int sum =0;
		
		for (int i=0; i<=40; i+=10) {
			
			sum+=i;
			System.out.println(sum);
		}
		
		System.out.println(sum);

	}
}
