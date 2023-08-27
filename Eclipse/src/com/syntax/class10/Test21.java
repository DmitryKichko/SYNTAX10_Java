package com.syntax.class10;


public class Test21 {

	public static void main(String[] args) {
		
		/*
		 *  Создайте двумерный массив, в котором будут храниться
		 *  следующие значения: Mr, Mrs, Ms, Miss 
		 *  и Smith, Jordan, Jackson, Obama.
		 *  После хранения значений напечатайте следующее: 
		 *  Миссис Смит, мистер Обама, мисс Джексон, мисс Джордан.
		 */
		
		String[][] name = {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		System.out.println(name[0][3] + " " + name[1][0]);
		System.out.println(name[0][0] + " " + name[1][3]);
		System.out.println(name[0][3] + " " + name[1][2]);
		System.out.println(name[0][3] + " " + name[1][1]);
		
		
		for (int r= 0; r<name.length; r++) {
			
			for (int b = 0; b<name[r].length; b++) {
				
				System.out.println(name[r][b]);
			}
			
		}
		
		System.out.println("--------------------------------------------");
		
		for(String[] arr:name) {
			
			for(String arr2:arr) {
				
				System.out.println(arr2);
				
			}
		}
	}	
}
