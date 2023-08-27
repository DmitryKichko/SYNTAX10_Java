package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
	
		
		
		/*
		 * Создать массив на двойных значениях с помощью сканера
		 * Вычислить сумму всех хранящихся в этом массиве элементов.
		 */

		Scanner scan;
		double[] array;
		double sum=0.0;
		
		scan=new Scanner(System.in);
		System.out.println("Сколько элементов нужно хранить в массиве");
		int size=scan.nextInt();
		
		array=new double [size];
		
		for(int i=0; i<size; i++) {
			
			array[i]=scan.nextDouble();
			sum+=array[i];
		}
		
		System.out.println("Всего: "+ sum);
		
	}

}
