package com.syntax.class14;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		
		// isEmpty()
		
		String name=" Batch 10";
		boolean results=name.isEmpty(); //isEmpty - если у нас нет символов (вернет - true), если есть (вернет - false)
		System.out.println(results);
		name=" ";
		System.out.println(name.isEmpty());
		
		System.out.println("-------------------------------");
		
		name="  ";
		// System.out.println(name.isBlank()); //isBlank - если у нас нет символов (вернет - true), если есть (вернет - false)
		
		//разница между .isEmpty() и .isBlank() они одинаковы, но:
		
		// .isEmpty() - если мы укажем пробелы (вернет false)  
		// .isBlank() - если мы укажем пробелы (вернет true) - не учитывает пробелы
		
		System.out.println("-------------------------------");
		
		String str="           Hi there         ";
		System.out.println(str);
		System.out.println(str.trim()); // .trim - обрезает (удаляет) пробелы, но не между словами 
		
		System.out.println("-------------------------------");
		
		String longStr="This class is easy";
		System.out.println(longStr.startsWith("T")); // .startsWith - показывает начинается ли слово с такой-то буквы
		System.out.println(longStr.startsWith("t"));
		System.out.println(longStr.startsWith("This")); // или слова (показывает true или false)
	}

}
