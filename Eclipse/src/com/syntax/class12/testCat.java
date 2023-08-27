package com.syntax.class12;

public class testCat {
	
	String name;
	String color;
	int age;
	
	void eat() {
		System.out.println(name + " кушает");
	}
	
	void sleep(){
		System.out.println(name+ " спит");
	}
	
	public static void main(String[] args) {
		
		testCat cat1 = new testCat();
		cat1.name = "Tom";
		cat1.color = "Black";
		cat1.age = 15;
		cat1.eat(); 
		cat1.sleep();
		
		testCat cat2 = new testCat();
		cat1.name = "Jerry";
		cat1.color = "Grey";
		cat1.age = 20;
		cat1.sleep();
		
	}
}
