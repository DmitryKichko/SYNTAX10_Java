package com.syntax.class13;

public class Methods {

	void RepeatWords(int times,String word) {
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	void isRaining(boolean isRain) {
		
		if(isRain) {
			System.out.println("Пожалуйста, возьмите зонтик");
		}else {
			System.out.println("Пойдемте прогуляемся");
		}
	}
	
	int add(int number1, int number2) {
		return number1+number2;
	}
}
