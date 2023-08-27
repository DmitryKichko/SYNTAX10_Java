package com.syntax.class02;

public class IdentifiersExample {

	public static void main(String[] args) {

		// RULES:
		/*
		 * Identifiers - name we give to classes, variable and methods 
		 * Keyword cannot be used as Identifiers
		 * Identifiers cannot start with number
		 * Identifiers cannot have with special character except:  _ AND $
		 */
		char singleLetter = 'c';

        //boolean new=true; do not use keyword to name your variable 

		//int 1num=100;  // error
		int num1=100;
		
		boolean boo_=true; 
		double $price=2.99;  
		//byte ^b=1; --> error
		
		//Preferences:
		/* follow camel casing
		 * JAVA Classes should start with upper case and follow camel casing 
		 * variable and methods in JAva should start with lowercase and follow camel casing 
		 * 
		 */
		
		short thisIsMyShortNumber=10;
		System.out.println(thisIsMyShortNumber);
		
		
		
		
		
		
	}

}
