package com.syntax.class04;

public class AnotherNestedIf {

	public static void main(String[] args) {
		
		/*
		 * у нас есть тест --> да или нет
		 * 
		 * если вы сделали тест, когда я хочу проверить результат
		 * 
		 * балл больше 90 --> студент A
		 * балл больше 80 --> студент B
		 * балл больше 70 --> студент C
		 * в противном случае: Вам следует больше готовиться к тесту
		 * 
		 */
	
		boolean isCompleted=true;
		int score=99;
		
		if (isCompleted) {
			System.out.println("Проверим вашу оценку");

			if (score > 90) {
				System.out.println("A Студент");
			} else if (score > 80) {
				System.out.println("B Студент");
			} else if (score > 70) {
				System.out.println("C Студент");
			} else {
				System.out.println("Пожалуйста, изучите больше перед сдачей теста");
			}

		} else {
			System.out.println("Вы должны были пройти тест !");
		}
	}

}
