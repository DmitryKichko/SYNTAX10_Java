package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {

		boolean vacine = true;
		boolean secondDose = true;

		if (vacine) { // Да

			System.out.println("Давайте проверим, сколько доз вы получили");

			if (secondDose) {
				System.out.println("Вы полностью привиты");
			} else {
				System.out.println("Вам необходимо получить вторую дозу препарата.");
				
			}

			System.out.println("Конец внешнего блока if");
		}
		
		System.out.println("--------ЕЩЕ ОДИН ПРИМЕР ВЛОЖЕННЫХ IF -------     ");

		
		
		/*
		 *  Каждая пятница - день кино
		 * если это 13-е число - вы хотите посмотреть страшный фильм
		 */
		
		int day=29;
		boolean isFriday=true;
		
		if (isFriday) {
			System.out.println("Я собираюсь посмотреть фильм");
			
			if (day==13) {
				System.out.println("Ура, я смотрю страшный фильм");
			} else {
				System.out.println("Я смотрю все, что популярно");
			}
			
		} else {
			System.out.println("Я собираюсь учиться");
		}
	
	}
}
