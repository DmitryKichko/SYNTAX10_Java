package com.syntax.class15;

public class Task3 {

	public static void main(String[] args) {
		
		
		// Создайте строку String и, если она не пуста, выполните следующие действия 
		// если Строка (String) имеет нечетное количество символов и содержит 3 или более символов,
		// то печатаем символ в середине Строки (String).
		
		String name ="hello";
		if(name.isEmpty()) {
			
			if(name.length()>3&& name.length()%2!=0) {
				System.out.println(name.charAt(name.length()/2));
			}
			
		}

	}

}
