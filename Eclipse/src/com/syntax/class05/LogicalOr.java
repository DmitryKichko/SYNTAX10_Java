package com.syntax.class05;

public class LogicalOr {
	public static void main(String[] args) {

	
		/*
		 *  определить день
		 * если день понедельник или пятница --> занятия не проводятся
		 * если день - вторник или среда --> Занятия по расписанию
		 * если день четверг --> обзорный урок
		 * если день суббота или воскресенье --> Java-класс
		 */
		
		String day = "Суббота";
		
		if(day.equals("Понедельник") || day.equals("Пятница")) {
			System.out.println("Занятия не проводятся по Syntax");
		}else if(day.equals("Вторник") || day.equals("Среда")) {
			System.out.println("Занятия по расписанию");
		}else if(day.equals("Четверг")) {
			System.out.println("Обзоный урок");
		}else {
			System.out.println("JAVA - класс");
		}
	
	}
}
