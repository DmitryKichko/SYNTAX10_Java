package com.syntax.class08;

public class HW {

	public static void main(String[] args) {
		
		//Найдите сумму четных и нечетных чисел от 1 до 100
		
		int sumEven = 0;
		int sumOdd=0;
		
		for (int i = 1; i<=100; i++) {
			
			if (i % 2==0) {
				sumEven +=i;  // это как sumEven = sumEven + i
				
			} else {
				
				sumOdd += i;
			}
			
		}
		
		System.out.println("Сумма всех четных чисел равна " + sumEven);
		System.out.println("Сумма всех нечетных чисел равна " + sumOdd);
		
	}

}
