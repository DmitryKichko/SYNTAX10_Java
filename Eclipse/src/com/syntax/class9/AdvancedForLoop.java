package com.syntax.class9;

public class AdvancedForLoop {

	public static void main(String[] args) {
		
System.out.println("---------------------------- Массив ARRAY --------------------------------");
		
		String[] cars = {"Corolla", "Tesla", "Checy", "Honda", "MItsubishi", "Xpeng", "Nio", "Kia"};
		
		for (int b=0; b<cars.length; b++) {
			
			System.out.println(cars[b]);
		}
		
		System.out.println("----------- advance for loop / ehnaced for loop / for each loop --------------");
		
		for(String car:cars) {
			
			System.out.println(car);
		}
		
		System.out.println("------------------ МАССИВ (ARRAY) ЧИСЕЛ ----------------------");
		
		int[] numbers= {100, 20, 67, 45, 90,23};
		
		for(int i=0; i<numbers.length; i++) {
			
		}
		
		System.out.println("---------------- advanced for loop / enhaced for loop / for each loop --------------------");

		for (int num:numbers) {
			
			System.out.println(num);
		}
		
		System.out.println("------------- CHAR ARRAY ------------------");
		
		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
		
		for(char grade:grades) {
			
			System.out.println(grade+" ");
		}
		
		System.out.println(" Я хочу выводить значения в обратном порядке !!!!!");
		
		for(int i=grades.length-1; i>=0; i--) {
			
			System.out.println(grades[i]);
			
		}
		
	}

}
