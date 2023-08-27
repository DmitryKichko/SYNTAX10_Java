package com.syntax.class02;

public class AddingOrConcatenating {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		
		int c=10;
		int d=20;
		System.out.println(c+d+a+b); // 30HelloWorld
		System.out.println(a+c+b+d); // Hello10World20
		System.out.println(a+(c+d)+b); // Hello30World
		System.out.println(a+c+d+b); // Hello1020World
				
		
		System.out.println(a+b+c+d); // HelloWord1020
		
		
		String cowbined=a+b+(c+d);
		System.out.println(cowbined);
		
		char grade='A';
		
		String str="Student";
		
		String newString=grade+str;
		System.out.println(newString);
		

	}

}
