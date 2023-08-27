package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {

			System.out.println("Сегодня воскресенье");
		
			if (i==4) {
				System.out.println("Я останавливаю цикл");
				break;
		
		}
			System.out.println(i);
		
		}
		boolean summer = true;
		int temp = 80;

		while (summer) {

			if (temp > 95) {
				System.out.println("Я не люблю жаркое лето");
				break;
			}
			System.out.println("Я люблю лето");
			temp += 2;

		}

	}

}
