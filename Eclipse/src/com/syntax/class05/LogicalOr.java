package com.syntax.class05;

public class LogicalOr {
	public static void main(String[] args) {

	
		/*
		 * Необходимо определить какой день:
		 *
		 * если понедельник или пятница --> занятия не проводятся
		 * если вторник или среда --> Занятия по расписанию
		 * если четверг --> обзорный урок
		 * если суббота или воскресенье --> Java-класс
		 */
		
		String day = "Суббота";
		
		if (day.equals("Понедельник") || day.equals("Пятница")) {
			System.out.println("Занятия по Java не проводятся");

		} else if (day.equals("Вторник") || day.equals("Среда")) {
			System.out.println("Занятия по расписанию");

		} else if(day.equals("Четверг")) {
			System.out.println("Обзорный урок");

		} else {
			System.out.println("JAVA - класс");
		}
	
	}
}
