package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {

		boolean understandJava = true;
		boolean enjoy = true;

		if (understandJava && enjoy) {
			System.out.println("Это потрясающе");
		} else {
			System.out.println("Пожалуйста, старайтесь уделять больше времени Java");
		}

		/*
		 * объявить число, если число меньше большего 1 И меньше 10 -->
		 * МАЛОЕ, если число больше 10, но меньше 100 --> СРЕДНЕЕ, если число
		 * больше 100, но меньше 1000 --> БОЛЬШОЕ, иначе число огромно
		 */

		int num = 1;
		 
		 if (num>0) {
			 if (num>=1 && num<10) {
				 System.out.println("число МАЛОЕ");
			 } else if(num>10 && num<100) {
				 System.out.println("число СРЕДНЕЕ");
			 } else if(num>100 && num<1000) {
				 System.out.println("число БОЛЬШОЕ");
			 } else {
				 System.out.println("Число ОГРОМНОЕ");
			 }
		 }else {
			 System.out.println("Число равно 0 и оно отрицательное");
		 }

	}
}
