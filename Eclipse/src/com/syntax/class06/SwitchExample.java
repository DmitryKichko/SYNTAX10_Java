package com.syntax.class06;

public class SwitchExample {
	public static void main(String[] args) {

		char gender = 'M';

		switch (gender) {

		case 'M':
			System.out.println("Мужчина");
			break;
			//  case 'M': СОВПАДЕНИЕ РЕГИСТРОВ НЕ ДОПУСКАЕТСЯ
		case 'F':
			System.out.println("Девушка");
			break;
		default:
			System.out.println("Пол не известен");

			System.out.println(" ----- ОГРАНИЧЕНИЯ ----------");
			
			
			// boolean boo=true;

			// switch(boo) {

			// }

			// double d=1.99;
			// switch (d) {
			// }
		}

	}
}
