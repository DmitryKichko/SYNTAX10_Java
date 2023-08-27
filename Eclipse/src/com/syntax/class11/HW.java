package com.syntax.class11;

public class HW {

	public static void main(String[] args) {
		/*
		 * Создайте двумерный массив автомобилей: 
		 * американские, немецкие, корейские, японские. 
		 * Затем извлекаем все значения из этого массива
		 * используя 2 различных цикла
		 */
		
		String[][] cars = {
				{ "Doge", "Ford", "Camaro"},
				{"BMW", "AUDI", "OPEL"},
				{  "KIA","Hunday" },
				{"Toyta", "Subaru", "Masda"}
		};
		
		for(int i = 0; i < cars.length; i++ ) {
			
			for (int j = 0; j < cars[i].length; j++) {
				
				System.out.println(cars [i] [j]);
			}
		}
		
		for (String[] cars1 : cars) {
			
			for(String cars2 : cars1) {
				
				System.out.print(" " + cars2);
			}
		}
		
		
		/*
		 * Используя двумерный массив, создайте список продуктов.
		 * Внутри должен быть массив, состоящий из: 
		 * Овощи, фрукты, молочные продукты и сладости.
		 * Извлеките все значения из этого массива с помощью двух различных циклов
		 */
		
		String[][] eat = {
				{ "Огурцы", "Помидоры", "Перец"},
				{"Нектарины", "Персики", "Абрикосы", "Яблоки"},
				{"Творог", "Молоко", "Сметана"},
				{"Конфеты", "Шоколад", "Торт"}
		};
		
		for (int a = 0; a<eat.length; a++) {
			
			for(int b=0; b<eat[a].length; b++) {
				
				System.out.print(" " + eat[a][b]);
			}
		}
		
		for(String[] eat1 : eat) {
			
			for(String eat2 : eat1) {
				
				
				System.out.println(" " + eat2);
			}
		}
		


	}

}
