package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
		
		/*
		 * Я хочу спросить, откуда вы родом?
		 * исходя из страны мы будем определять традиционный?
		 */
		
		Scanner in;
		String country, tradionalFood;
		
		in=new Scanner(System.in);
		System.out.println("Привет, откуда ты? ");	
		country=in.nextLine();
		
		switch(country) {
		
		case "США":
			tradionalFood="Бургер";
			break;
		case "Афганистан":
			tradionalFood="qabeli Palaw";
			break;
		case "Перу":
			tradionalFood="cevice";
			break;
		case "Италия":
			tradionalFood="Паста";
			break;
		case "Таджикистан":
			tradionalFood="kuruto";
			break;
		case "Украина":
			tradionalFood="Борщ";
			break;
		case "Казахстан":
			tradionalFood="бешбармак";
			break;
		case "Турция":
			tradionalFood="борек";
			break;
		default:
			tradionalFood="Не знаю";
				
		}
		
		System.out.println("Вы из "+country+" и ваша традиционная еда - это "+tradionalFood);
	}

}
