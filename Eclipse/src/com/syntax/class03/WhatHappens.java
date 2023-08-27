package com.syntax.class03;

public class WhatHappens {

	public static void main(String[] args) {
	
		//int i=1.99; error 
		
		int i=(int)1.99; // narrowing or explicit casting (сужение или явное приведение)
		System.out.println(i);
		
		double d=1; // widening or implicit casting (расширение или неявное приведение)
		System.out.println(d); //1.0
		 
		byte b=(byte)128; // narrowing (сужение) 
		System.out.println(b);
		
		int num=20;
		int num1=3;
		
		System.out.println(num/num1); // мы делим 2 значения int, и они не имеют десятичных дробей 
		
		double num2=20;
		double num3=3; // происходит преобразование из int в double
		
		System.out.println(num2/num3); // деление 2 двойных значений
		
		float f=10.99f;
		double number=10.99;
		
		int t=100; 
		
		int n1 = 20;
		int n2 = 3;
		double dd = n1/n2; // мы делим 2 значения int и только потом результат сохраняем в типе double 
		System.out.println(dd); //6.0
		
		}
		
	}


