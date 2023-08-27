package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		int day = 8;
		String dayName;

		// утверждение if является утверждением, основанным на условии (истина/ложь)
		// if else if подобен лестнице
		if (day == 1) {
			System.out.println("Сегодня Понедельник");
		} else if (day == 2) {
			System.out.println("Сегодня Вторник");
		} else if (day == 3) {
			System.out.println("Сегодня Среда");
		} else if (day == 4) {
			System.out.println("Сегодня Четверг");
		} else if (day == 5) {
			System.out.println("Сегодня Пятница");
		} else if (day == 6) {
			System.out.println("Сегодня Суббота");
		} else if (day == 7) {
			System.out.println("Сегодня Воскресенье");
		} else {
			System.out.println(day + " является двузначным. Пожалуйста, используйте день с 1 по 7");
		}

		System.out.println("--------------- SWITCH ------------------------");

		// switch - это оператор, основанный на значении. Если найден подходящий случай значения, то сразу же происходит переход.
		// switch подобен лифту

		/*
		 * в switch всегда помните:
		 * 
		 * Всегда используйте break; --> для остановки и выхода из блока switch
		 * тип переменной и значения case ДОЛЖНЫ быть одного типа данных (datatType)
		 * 
		 * по умолчанию: --> необязательно
		 */
		
		switch (day) {

		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid";
		}

		System.out.println("Today is " + dayName);

	}

}
