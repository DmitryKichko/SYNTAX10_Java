package com.syntax.class14;

public class StringDemo {

	public static void main(String[] args) {
		
		String str = "12345";
		
		String str2 = new String("Hello");
		
		System.out.println(str2.length());
		System.out.println(str.length());
		
		// .length - показывает сколько у нас символов
		
		
		/////
		String name="MICHAEL";
		System.out.println(name.toLowerCase());
		
		// .toLowerCase - преобразует заглавные буквы в строчные (применим только к буквам)
		
		String name2="noor khan 12 3";
		System.out.println(name2.toUpperCase());
		
		// .toUpperCase - преобразует строчные буквы в заглавные (применим только к буквам)
		
		///
		String firstName="Andrei";
		String lastName="Drozzhins"; 
		System.out.println(firstName.concat(" ").concat(lastName)); // .concat - объединяет строки 
		System.out.println(firstName+ " "+lastName); // то же самое
		
		// .concat - объединяет строки 
		//
		
		

	}

}
