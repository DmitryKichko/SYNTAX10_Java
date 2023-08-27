package com.syntax.class14;

public class StringMethodDemo3 {

	public static void main(String[] args) {
		
		
		String longStr="This class is easy";
		System.out.println(longStr.endsWith("y")); // .startsWith - показывает заканчивается ли слово с такой-то буквы
		System.out.println(longStr.endsWith("easy"));
		System.out.println(longStr.endsWith("This class is easy")); // или слова (показывает true или false)
		
		System.out.println("------------------------------------");
		//
		
		System.out.println(longStr.contains("class  "));  // .contains - присутствует ли данное слово или буква в строке  
		System.out.println(longStr.contains("i"));
		
		System.out.println("------------------------------------");
		
		longStr="blabla";
		System.out.println(longStr.equals("blabla")); 
		System.out.println(longStr.equalsIgnoreCase("blabla"));
		
		// .equals и .equalsIgnoreCase работают одинаково (проверяют есть ли данное слово) но:
		// если в .equals - мы напишем слово для проверки с заглавной буквы (выдаст - false)
		// если в .equalsIgnoreCase - мы напишем слово для проверки с заглавной буквы (выдаст - true) - игнорирует заглавные буквы
		
		System.out.println("------------------------------------");
		
		longStr="blabla";
		System.out.println(longStr.charAt(0)); 
		System.out.println(longStr.charAt(1));
		System.out.println(longStr.charAt(3));
		
		// .charAt() - показывает отдельный символ указав индекс символа
		
		System.out.println("------------------------------------");
		
		System.out.println(longStr.indexOf("b")); // .indexOf() - проверяет на каком уровне находится индекс 
		System.out.println(longStr.indexOf("l"));
		System.out.println(longStr.indexOf("z")); // если такого символа не существет на выходе получим -1 
		System.out.println(longStr.indexOf("b", longStr.indexOf("b")+1));
		
		System.out.println("------------------------------------");
		
		System.out.println(longStr.substring(3));
		System.out.println(longStr.substring(2,4));
	}

}
