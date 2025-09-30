package com.syntax.class07;

public class WhyNeedLoops {

	public static void main(String[] args) {
	
		// Я хочу сказать "привет" 4 раза:
		
		System.out.println("Привет");
		System.out.println("Привет");
		System.out.println("Привет");
		System.out.println("Привет");
		
		int a = 1;
		
		System.out.println("------------------ С использованием функции: if statment ------------------");
		if (a < 4) {
			System.out.println("Здравствуйте");
		}
		
		System.out.println("------------------ С использованием цикла: while ------------------");
		
		while(a <= 4) {
			System.out.println("Здравствуйте");
			a++;  // - Инкремент





			/* ПРИМЕР БЕСКОНЕЧНОГО ЦИКЛА
			 * 
			 * while (a<=4) {
			 * System.out.println("Hello");
			 *     }
			 */

			
		}



	}
}
