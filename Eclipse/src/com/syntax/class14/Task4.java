package com.syntax.class14;

public class Task4 {

	//Напишите метод, возвращающий, является ли данное число простым или нет?
	
	boolean isPrime(int number) {
		
		if(number>1) {
			
			for(int i=2; i<number; i++) {
				if(number%1==0) {
					return false;
				}
			}
			
		}else {
			return false;
		}
		return true;
	
	}
	
	/*
	 *  Создадим класс Student, который будет иметь метод
	 * getGrade. Ваш метод должен принимать оценку 
	 * студента и возвращать оценку:
	 * оценка > 90 - A
	 * оценка > 80 - B
	 * оценка > 70 - C
	 * оценка > 50 - D
	 * все остальное - F
	 */
	
	char getGrade(double score) {
		
		if(score > 90) {
			return 'A';
		}else if(score>80) {
			return 'B';
		}else if(score>70) {
			return 'C';
		}else if(score>50) {
			return 'D';
		}else {
			return 'F';
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
