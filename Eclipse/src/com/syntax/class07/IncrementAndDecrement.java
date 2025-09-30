package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {

		// Способы для прибавления 1:

		int i = 10;
		
		i = i + 1;
		i += 1;
		
		System.out.println(i);
		i++;  // i+1
		
		System.out.println(i);

		// Способы для вычитания 1:

		int a = 10;
		a -= 1;
		
		a--; // a-1
		System.out.println(a);
		
		//10++; ++ или -- не работают с числами, применимы только для ПЕРЕМЕННЫХ
		
	}
}
