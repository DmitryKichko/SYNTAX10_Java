package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {

		System.out.println(" -------------- Напечатать \"Как дела\" - 10 раз --------------");
		int i = 0;

		while (i < 10) {
			System.out.println(i + ")" + " - " + "Как дела");
			i++;
		}

		System.out.println(" -------------- Напечатать числа от 1 до 20  -------------- ");

		int a = 1;

		while(a <= 20) {
			System.out.println(a);
			a++;
		}
		
		
		System.out.println(" Напечатать числа от 100 до 110 ");
		
		int var = 100;
		
		while (var <= 110) {
			System.out.print(var + " ");
			var++;
		}
	
		System.out.println(" Напечатать числа от 100 до 110 ");

		int num = 10;
		
		while (num >= 1) {
			System.out.print(num + " ");
			num--;
		}

		System.out.println(" Вывести нечетные числа от 1 до 20 ");
	
		int n=1;
		
		while (n < 21) {
			System.out.println(n);
			n+=2;
		}
		
		
		System.out.println(" Вывести нечетные числа от 1 до 20, используя оператор if ");
		
		n=1;
		
		while (n < 21) {
			if (n%2 != 0) {
			System.out.println(n);		
			}
			
			n++;
		}
		
		System.out.println("Конец кода!!!!!");
		
	}
	

}
