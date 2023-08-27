package com.syntax.class14;

public class Task3 {

	// Создайте метод createEmail(). На основе значений имени пользователя, lastName и email,
	// ваш метод должен возвращать полный адрес электронной почты. Пример: createEmail(John, Snow, gmail) ->.
	// johnsnow@gmail.com

	String createEmail(String firstName, String lastname, String emailtype) {
		
		return firstName + lastname + "@" + emailtype + ".com";
	}

}
