package com.syntax.class12;

public class Task1 {

	public static void main(String[] args) {

// 1) Создать двумерный массив (2D array) целочисленных значений. Выведите сумму всех чисел.

		int[][] array = { { 1, 2, 3, 4, 5 }, 
				{ 10, 20, 30, 40, 50 } };
		
		

		System.out.println("Количество строк в двумерном массиве " + array.length);

		int sum=0;
		
		for (int row = 0; row < array.length; row++) {
			
			
			
			System.out.println("Количество колонок в " + row + " строка "+array[row].length);
			
			for (int col = 0; col < array[row].length; col++) {
				
				System.out.println(array[row][col]);
				
				sum=sum+array[row][col];

			}
			
		}
		
		System.out.println("Сумма "+sum);
	}

}
