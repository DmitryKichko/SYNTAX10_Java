package com.syntax.class06;

public class LogicalOperatorsRecap {

	public static void main(String[] args) {

		System.out.println("-------    Пример OR   --------");

		String position = "Тестировщик автоматизации";

		if (position.equals("Тестировщик автоматизации") || position.equals("Ручное тестирование")) {
			System.out.println("Я счастлив");
		}

		System.out.println("-------    Пример: AND   --------");

		int salary = 100000;

		if (position.equals("Тестировщик автоматизации") && salary >= 100000) {
			System.out.println("Я очень рад !!!!!");
		}

		System.out.println("-------    Пример: NOT   --------");

		boolean study = false;

		if (!study) {
			System.out.println("Вы не получите работу");
		}

	}

}
