package com.syntax.class03;

public class MoreIfExamples {

	public static void main(String[] args) {

		double a = 30;
		double b = 20;

		if (a > b) {
			System.out.println(" a больше b");
		} else {
			System.out.println(" не печатать");
		}

		System.out.println("---------------");
		
		if (a == b) { //условие (if) всегда должно быть boolean значением 
			System.out.println("Цифры равны");
			System.out.println("Мои цифры одинаковые");
		} else {
			System.out.println("Цыфры не равны");
			System.out.println("Цыфры не одинаковы");
			System.out.println("I am else block code");
		}
		System.out.println(a=b);

		System.out.println("---------------------------");
		
		/*
		 * если сейчас перерыв -> я выпью кофе. 
		 * в противном случае я сосредоточусь на занятиях
		 */
		boolean isBreakTime=true;
		
		if (isBreakTime==true) {
			System.out.println("Я пью свое кофе");
		} else { 
			System.out.println("Я концентрируюсь на классе");
		}
		
		/*
		 *  if если вы голодны -> я пойду поем
		 *  else В противном случае: Я пойду выпью чаю
		 */
		
		
		
		
		boolean isHungry=false;  // такой вариант предпочтительней 
		
		if (isHungry) {
			System.out.println("Я пойду поем");
		} else {
			System.out.println("Я пойду выпью чаю");
		}
		
	}
}
