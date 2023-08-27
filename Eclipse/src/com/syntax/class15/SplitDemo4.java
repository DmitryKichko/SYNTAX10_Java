package com.syntax.class15;

public class SplitDemo4 {

	public static void main(String[] args) {
		
		String str = "This is Batch";
		String strArr[]=str.split("i"); // разбивает строку на части по букве i
		System.out.println(strArr.length);
		System.out.println(strArr[0]); // Th
		System.out.println(strArr[1]); // s
		System.out.println(strArr[2]);// is Batch

	}

}
