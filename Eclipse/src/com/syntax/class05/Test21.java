package com.syntax.class05;

import java.util.Scanner;

public class Test21 {
	
public static void main(String[] args) {
	
	/*
	 * Напишите программу, которая будет считывать три входных данных 
	 * оценок (контрольная работа, промежуточные и итоговые оценки) и 
	 * определять оценку на основе следующих
	 * правила:
	 * - если средний балл >=90 -> оценка=A
	 * - если средний балл >=70 и <90 -> оценка=B
	 * - если средний балл >=50 и <70 -> оценка=C
	 * - если средний балл <50 -> оценка=F
	 */
	
	Scanner scan;
	int kontrRab, promeg, itog, average;
	
	scan=new Scanner(System.in);
	
	System.out.println("Какая у вас оценка по контрольной работе");
	
	kontrRab=scan.nextInt();
	
	System.out.println("Какие у вас промежуточные оценки?");
	
	promeg=scan.nextInt();
	
	System.out.println("Какие у вас итоговые?");
	
	itog=scan.nextInt();
	
	average = (kontrRab+promeg+itog)/3;
	
	System.out.println("Ваш средняя оценка "+ average);
	
	if (average>=90) {
		System.out.println("Оценка A");
	}else if(average>=70 && average<90) {
		System.out.println("Оценка B");
	}else if (average>=50 && average<70) {
		System.out.println("Оценка C");
	}else if (average<50) {
		System.out.println("Оценка F");
	}
	
	
}
}
