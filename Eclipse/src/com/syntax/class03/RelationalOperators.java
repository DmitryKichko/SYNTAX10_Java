package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		
		
		int num=11;
		int num1=11;
		
		System.out.println(num>num1);
		System.out.println(num!=num1);
		System.out.println(num<num1);
		System.out.println(num==num1);
		System.out.println(num>=num1);
		
		int a = 100;
		int b=190;
		boolean boo=a<b; //результат работы реляционных операторов ВСЕГДА является булевым значением (true или false)
		System.out.println(boo);
		
		System.out.println("-----------");
		
		System.out.println(a==b); //проверка на равенство
		System.out.println(a=b); //переназначение значения переменной b на a
		
		System.out.println(a<b); //False (так как выше мы написали что a = b)
		System.out.println(a<=b);
		
		
		

		
		
		
	}

}
