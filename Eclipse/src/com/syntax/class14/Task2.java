package com.syntax.class14;

public class Task2 {

	// Создайте метод, который будет говорить Hello на разных языках в зависимости от
	// страны
	//, которая будет передаваться при выполнении метода.

	void printHello(String country) {

		switch (country) {
		case "USA":
			System.out.println("Hello");
		case "Germany":
			System.out.println("Hello");
		case "Afganistan":
			System.out.println("Salam alkykum");
		case "Turkey":
			System.out.println("Merhaba");
			break;
		default:
			System.out.println("Недопустимое название страны");

		}

	}

}
