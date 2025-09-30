package com.syntax.class06.hwAndTask;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	/*
	 * Написать программу, которая просит пользователя ввести значение для распродажи (да или нет):
	 *
	 * - если распродажи нет --> вы не пойдете за покупками
	 * - если распродажи есть --> попросить пользователя ввести цену товара
	 *
	 * На основе цены необходимо рассчитать цену товара после скидки:
	 *
	 * - если цена меньше 20$ --> применить 20%
	 * - если цена меньше 20$ и 100$ --> применить 30%
	 * - если цена от 100$ до 500$ --> 30%
	 * - в противном случае применяется скидка 50%
	 * 
	 * После применения скидки __ цена товара уменьшается с __ до __
	 */
	
	Scanner in = new Scanner(System.in);
	String sale;
	double price;
	int discount = 0;
	double finalPrice;
	
	System.out.println("Есть ли сейчас распродажа");
	sale = in.nextLine();
	
	if(sale.equals("Да")) {
		
		System.out.println("Что бы Вы хотели приобрести?");
		String item = in.nextLine();
		
		System.out.println("Какова цена товара?");
		price = in.nextDouble();
		
			if (price < 20) {
				discount = 10;
			} else if (price >= 20 && price < 100) {
				discount = 20;
			} else if (price >= 100 && price < 500) {
				discount = 30;
			} else if (price > 500) {
				discount = 50;
			} else {
				System.out.println("Неправильный ввод цены");
			}
			finalPrice = price - (price * discount / 100);
		
			System.out.println("С учётом применения " + discount + "% скидки, цена товара " + "уменьшена с $ " + price + " до " + finalPrice);
		
		} else {
			System.out.println("Извините, сегодня покупок нет!");
		}
	
	}
}
