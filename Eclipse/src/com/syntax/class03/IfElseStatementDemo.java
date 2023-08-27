package com.syntax.class03;

public class IfElseStatementDemo {

	/*
	 * shortcut for main:
	 * тип main +ctrl+space+enter
	 */
	public static void main(String[] args) {
		
		
		/*
		 *  У меня есть деньги, и я знаю цену.
		 *  если у меня будет больше денег - я куплю печенье
		 *  в противном случае я буду плакать
		 */
		
		System.out.println("Начало моей программы");
		
		double money=10;
		double $cookie=1.99;
		
		if (money>$cookie) { //if true
			System.out.println("Я покупаю это печенье");
		}else { //if false
			System.out.println("Я сейчас заплачу");
		}
		
		
		
	}
}
