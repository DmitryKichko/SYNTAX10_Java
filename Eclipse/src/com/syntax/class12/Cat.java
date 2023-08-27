package com.syntax.class12;

public class Cat {
	
	String name;
	String color;
	int age;
	void eat() {
		System.out.println(name+ " ест");
	}
	void sleep() {
		System.out.println(name+ " спит");
	}

	public static void main(String[] args) {
		
		Cat cat1=new Cat();
		cat1.name="Том";
		cat1.color="Черный";
		cat1.age=5;
		cat1.eat();
		cat1.sleep();
		
		Cat cat2=new Cat();
		cat2.name="Джер";
		cat2.color="Серый";
		cat2.age=12;
		cat2.sleep();
		

	}

}
