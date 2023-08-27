package com.syntax.class03;

public class IfWithNoBraces {

	public static void main(String[] args) {
		
		System.out.println("Code starts.....");

		double temp = 31;
		if (temp < 32) 
			System.out.println("Вода замерзает при изменении температуры  " + temp);
		else 
			System.out.println("Вода не замерзает при изменении температуры " + temp);
		    System.out.println("Потому что на улице тепло");
		
		
		/*
		 * Когда оператор if используется без {} 
		 * то java позволяет использовать только 1 оператор для каждого блока
		 * то есть 1 строка для блока if и ТОЛЬКО 1 строка для блока else 
		 */
		
	}
}
