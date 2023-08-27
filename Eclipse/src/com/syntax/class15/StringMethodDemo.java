package com.syntax.class15;

public class StringMethodDemo {

	public static void main(String[] args) {
		
		String str="Я хороший тестировщик. Я хороший человек";
		System.out.println(str.replace("a", "A"));
		System.out.println(str.replace("хорошо", "Озорник"));
		
		String str2="skdgksgbASAHDS6789765557!@#$%^";
		System.out.println(str2.replaceAll("[0-9]", "+")); // заменит все цифры от 0-9 в строке
		System.out.println(str2.replaceAll("[A-Z]", "")); // удалит все заглавные буквы из исходных писем
		System.out.println(str2.replaceAll("[a-z]", "")); // удалит все строчные буквы
		System.out.println("--------------------------------------------------------");
		System.out.println(str2.replaceAll("[a-z0-9]", "")); // удалит все строчные буквы и цифры
		System.out.println(str2.replaceAll("[a-z5-9A-Z]", "")); // удалит все верхние регистры строчных букв и цифры в диапазоне
		System.out.println(str2.replaceAll("a-z5-9A-Z", ""));
		System.out.println(str2.replaceAll("a-z0-9A-Z", ""));
		System.out.println(str2.replaceAll("^", ""));
		  str2="";
		  
		  // "[]" - это регулярные выражения 
	}

}
