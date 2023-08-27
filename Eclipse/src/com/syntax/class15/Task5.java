package com.syntax.class15;

public class Task5 {

	public static void main(String[] args) {
		
		/*
		 * 1) Создайте строку String, в которой будет храниться предложение.
		 *    Напишите программу для получения новой строки без пробелов.
		 *    
		 * 2) Создать Строку, которая должна состоять из комбинации букв, цифр и специальных символов.
		 *    Определите, сколько буквенных символов содержится в Строке.
		 *    
		 * 3) У вас есть Строка a="Сегодня суббота? Идет ли дождь? 
		 *    У нас сегодня занятие по Java?".
		 *    Как узнать, сколько предложений содержится в этой строке?
		 */
		
		String str = "Hello word Dmitry";
		
		System.out.println(str.replace(" ", ""));
		
		String str2 = "Hello 1234 !@$%#^&";
		System.out.println(str2.length());
		
		
		String str3 = "Сегодня суббота? Идет ли дождь? У нас сегодня занятие по Java?";
		
		String[] st = str3.split("[?]");
		
		System.out.println(st.length);
	}

	}

