package com.syntax.class9;

public class MoreArrays {

	public static void main(String[] args) {
		
		double[] d=new double[4]; // массивы имеют фиксированный размер
		//во время выполнения, когда java выполняет код--> она не может увеличить размер
		d[1]=10.99;
		d[2]=12.99;
		d[3]=10;
		//d[4]=1.99; //Индекс массива выходит за пределы границ
		
		System.out.println(d[3]);
		
		int[] numbers=new int[2];
		
		numbers[0]=100;
		numbers[1]=200;
		
		System.out.println(numbers[1]);
		
		int num; // объявление переменной
		num=10;
		
		int arrayVar[]; //объявление массива array
		int[] arr; //объявить массив --> ПРЕДВАРИТЕЛЬНО
		
		
		arr=new int[3];
		arr[0]=10;
		
		System.out.println(arr[1]);
		

	}

}
