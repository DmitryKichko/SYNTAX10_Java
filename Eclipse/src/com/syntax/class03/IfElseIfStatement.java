package com.syntax.class03;

public class IfElseIfStatement {
        public static void main(String[] args) {
	    
        	/*
        	 *  какое число является наибольшим
        	 */
        	
        	int num1=20;
        	int num2=10;
        	
        	if (num1>num2) {
        		System.out.println(num1+" больше, чем "+ num2);
        	} else if(num1<num2) {
        		System.out.println(num1+ " меньше, чем "+num2);
        	} else {
        		System.out.println(num1+" равен "+num2);
        	}
        	
        	System.out.println("------------------------------------");
        	
        	/*
        	 *  Объявить переменную day и на основе значения day вывести вывод типа
        	 *  если день равен 1 --> Сегодня понедельник
        	 *  если день равен 2 --> Сегодня вторник 
        	 */
        	
        	
        	int day=70;
        	
        	if (day==1) {
        		System.out.println("Сегодня понедельник");
        	} else if (day==2) {
        		System.out.println("Сегодня вторник");
        	} else if (day==3) {
        		System.out.println("Сегодня среда");
        	} else if (day==4) {
        		System.out.println("Сегодня четверг");
        	} else if (day==5) {
        		System.out.println("Сегодня пятница");
        	} else if (day==6) {
        		System.out.println("Сегодня суббота");
        	} else if (day==7) {
        		System.out.println("Сегодня воскресенье");
        	} else {
        		System.out.println(day+ " является двузначным. Пожалуйста, используйте день (day) с 1 по 7");
        	}
	
}
} 
