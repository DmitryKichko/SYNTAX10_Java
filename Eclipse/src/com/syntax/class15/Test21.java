package com.syntax.class15;

public class Test21 {

	public static void main(String[] args) {
		
		
		String str = "ABCD";
		
		System.out.println(str.concat("Z"));
		System.out.println(str);
		
		StringBuilder str2 = new StringBuilder("ABCD");
		
		System.out.println(str2.append(str2));
		System.out.println(str2);
		
		StringBuilder str3 = new StringBuilder("Sunday");
		System.out.println(str3.reverse());
		
		
		String name = "Ali";
		StringBuilder str4 = new StringBuilder(name);
		
		System.out.println(str4);
		
		name=str4.toString();
		System.out.println(name);
		
		StringBuffer strin = new StringBuffer("jfdjdjd");
		
		
		
	}

}
