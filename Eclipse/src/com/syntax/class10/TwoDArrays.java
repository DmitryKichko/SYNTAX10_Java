package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		
		int a;
		int[] b=new int[3];
		
		//создание двумерного массива
		int [] [] c =new int[3] [4];
		//1 строка или 1 массив
		c[0][0]=11;
		c[0][1]=12;
		c[0][2]=13;
		c[0][3]=14;
		//2 строки или 2 массива
		c[1][0]=20;
		c[1][1]=30;
		c[1][2]=40;
		c[1][3]=50;
		
		//3 строки или 3 массива
		c[2][0]=100;
		c[2][1]=200;
		c[2][2]=300;
		c[2][3]=400;
		
		System.out.println(c[1][3]); //50 //для доступа указать, с какого индекса строки и индекса столбца
		System.out.println(c[2][1]); //200 //для доступа укажите, из какого индексного массива и какой индекс элемента вам нужен
		
		System.out.println("------ Another way of creating a 2D array -------");
		
		int [][] myArray= {
				{11,12,13,14,15},  //1 массив
				{20,30,40}, //2 массив 
				{100,200,300,400} //3 массив
				
				
		};
		System.out.println(myArray[0][4]); //15
		System.out.println(myArray[1][0]); //20
	
		}
		
		
		
		
		
	}


