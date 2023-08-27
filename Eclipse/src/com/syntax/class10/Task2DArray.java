package com.syntax.class10;

public class Task2DArray {

	public static void main(String[] args) {
		
		/*
		 *  Создайте двумерный массив, в котором будут храниться
		 *  следующие значения: Mr, Mrs, Ms, Miss 
		 *  и Smith, Jordan, Jackson, Obama.
		 *  После хранения значений напечатайте следующее: 
		 *  Миссис Смит, мистер Обама, мисс Джексон, мисс Джордан.
		 */

		String[][] arrName = { 
				{ "Mr", "Mrs", "Ms", "Miss" }, 
				{ "Smith", "Jordan", "Jackson", "Obama" } 
		};

		System.out.println(arrName[0][1] + " " + arrName[1][0]);
		System.out.println(arrName[0][0] + " " + arrName[1][3]);
		System.out.println(arrName[0][2] + " " + arrName[1][2]);
		System.out.println(arrName[0][3] + " " + arrName[1][1]);

		System.out.println("    --------------------------    ");
		// как получить доступ ко всем элементам

		for (int r = 0; r < arrName.length; r++) { // Внешний цикл выполняет итерацию по строкам

			for (int c = 0; c < arrName[r].length; c++) { // Внутренний цикл выполняет итерацию по столбцам

				System.out.println(arrName[r][c] + " ");

			}
			
			
			
			
			
			

		}

		System.out.println("--------------------------------------------");
		
		for(String[] arr:arrName) {
			
			for(String arr2:arr) {
				
				System.out.print(" " + arr2);
	}
}
		/*
		 * Создать двумерный массив, первая строка которого будет 
		 * содержать 4 фамилии, а вторая строка будет 
		 * содержать оценки. Затем программа 
		 * должна вывести имена студентов, которые 
		 * имеет оценки A и B 
		 */
}
}