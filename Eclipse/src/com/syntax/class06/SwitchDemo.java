package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		int day = 8;
		String dayName;

		// утверждение if является утверждением, основанным на условии (истина/ложь)
		// if else if подобен лестнице
		if (day == 1) {
			System.out.println("Сегодня: Понедельник");
		} else if (day == 2) {
			System.out.println("Сегодня: Вторник");
		} else if (day == 3) {
			System.out.println("Сегодня: Среда");
		} else if (day == 4) {
			System.out.println("Сегодня: Четверг");
		} else if (day == 5) {
			System.out.println("Сегодня: Пятница");
		} else if (day == 6) {
			System.out.println("Сегодня: Суббота");
		} else if (day == 7) {
			System.out.println("Сегодня: Воскресенье");
		} else {
			System.out.println(day + " - является двузначным. Пожалуйста, используйте число день: от 1 до 7");
		}

		System.out.println("------------------------ SWITCH ------------------------");

		/**
		switch - это оператор, основанный на значении.
		Если найден подходящий случай значения, то сразу же происходит переход.

		switch подобен лифту
		*/

		/*
		 * !!! В switch помните!!!
		 * 
		 * ВСЕГДА используется:
		 *
		 * 1) break; --> для остановки и выхода из блока switch
		 *
		 * 2) Тип переменной и значения case ДОЛЖНЫ быть одного типа данных (Например: String)
		 *
		 * 3) Использовать break; в default: --> НЕОБЯЗАТЕЛЬНО так как он и так последний
		 *
		 * 4) Использовать default: --> НЕОБЯЗАТЕЛЬНО
		 *
		 * 5) Использовать default: --> Можно первым, но самое главное тогда нужно использовать break;
		 * (так как условие выполниться и компилятор не поймёт что нужно остановиться и пойдёт дальше)
		 */
		
		switch (day) {

		case 1:                             // если значение day = 1
			dayName = "Понедельник";            // то я инициализирую dayName и присвою значение: "Понедельник"
			break;                          // и на этом останавливаем проверки дальше
		case 2:
			dayName = "Вторник";
			break;
		case 3:
			dayName = "Среда";
			break;
		case 4:
			dayName = "Четверг";
			break;
		case 5:
			dayName = "Пятница";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Суббота";
			break;
		default:
			dayName = "Воскресенье";
		}

		System.out.println("Сегодня день: " + dayName);

	}
}
