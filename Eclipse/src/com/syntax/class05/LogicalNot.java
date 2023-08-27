package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean b=!true;
		
		boolean a=!false;
		
		System.out.println(b); //false
		System.out.println(a); //true
		
		boolean hungry=true;
		
		if (!hungry) {
			System.out.println("Я не голоден");
		}
		
		System.out.println("---------------------------------------------");
		
		boolean hot = true;
		
		if (!hot) {
			System.out.println("Я пойду прогуляюсь");
		}
		
		System.out.println("Конец кода класса");
		
		String name="Hamza";
		
		if (!name.equals("Stephanie")) {
			System.out.println("Тогда я вас не ищу");
		}
		
				
	}

}
