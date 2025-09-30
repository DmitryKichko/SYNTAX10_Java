package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {

		/*
		 * Спросить, откуда вы родом?
		 *
		 * Исходя из страны необходимо определить традиционное блюдо.
		 */
		
		Scanner in;
		String country, traditionalFood;
		
		in=new Scanner(System.in);
		System.out.println("От куда вы родом?");
		country=in.nextLine();
		
		switch(country) {
		
		case "США":
			traditionalFood = "Бургер";
			break;
		case "Афганистан":
			traditionalFood = "Кабульский плов";
			break;
		case "Перу":
			traditionalFood = "Севиче";
			break;
		case "Италия":
			traditionalFood = "Паста";
			break;
		case "Таджикистан":
			traditionalFood = "Курутоб";
			break;
		case "Украина":
			traditionalFood = "Борщ";
			break;
		case "Казахстан":
			traditionalFood = "Бешбармак";
			break;
		case "Турция":
			traditionalFood = "Борек";
			break;
		default:
			traditionalFood = "Не знаю традиционное блюдо этой страны";

		}
		
		System.out.println("Вы из " + country + " и ваша традиционное блюдо - это " + traditionalFood);
	}

}
