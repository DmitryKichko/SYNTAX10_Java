package com.syntax.class15;

public class SplitDemo2 {

	public static void main(String[] args) {
		
		String str = "This is Batch 10. Batch 10 is great";
		String[] strArr=str.split("[.]");
		
		
		for (String string : strArr) {
			System.out.println(string);
		}
		
	}

}
