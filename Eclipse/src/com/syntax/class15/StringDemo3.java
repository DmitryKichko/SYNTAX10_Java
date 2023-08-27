package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		
		
		String str = "?This is Batch 10? Batch 10 is great? How are you?";
		
		
		
		
		String[] strArr=str.split("[?]");
		System.out.println(strArr.length);
		
		
		System.out.println(strArr[3]);

	}

}
