package com.syntax.class01;

public class DataTypesAndVariables {

	public static void main(String[] args) {
		
		/*
		 * 
		 * byte - тип данных (Используется для хранения целых чисел в переменной)
		 * Variable - имя переменной/ящика/контейнера
		 * 10 - значение переменной
		 * 
		 */

		// Используется для хранения целых чисел в переменной
		byte variable = 127; // самая маленькая ячейка для хранения данных
		short variable1 = 32767;
        int var3 = 1000; // самый распространенный тип данных для целых чисел
        long var4 = 9999999999999l; // для больших целых значений (не забываем про L в конце значения)


        // Используется для хранения чисел с десятичными дробями
        float myFloat = 10.99f; // на конце значения f
        double myDouble = 100.99; // часто используется


        // Хранение 1-го символа/буквы
        char singleLatter = 'J';
        char specialVharacter = '%';


        // Для хранения boolean значений, да или нет (true/false)
        boolean myBoo = true;
        boolean myBoo2 = false;

        System.out.println(variable);
        System.out.println("variable");


        boolean myBoo1 = true;
        System.out.println(myBoo1);

        // Пример ссылочной переменной

        String s = new String("Привет");

        System.out.println(s);
        

        
        
	}

}
