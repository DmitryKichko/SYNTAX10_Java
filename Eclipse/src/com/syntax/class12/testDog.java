package com.syntax.class12;

public class testDog {
	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		System.out.println("собака может лаять ");
	}
	
	void sleep() {
		System.out.println("собака может спать");
	}
	
	public static void main(String[] args) {
		
	testDog dog1 = new testDog();
	
	dog1.name = "James";
	dog1.breed = "Bulldog";
	dog1.color = "White";
	dog1.age = 20;
	dog1.height = 15;
	dog1.gender = 'M';
	
	dog1.bark();
	dog1.sleep();
	
	testDog dog2 = new testDog();
	
	dog2.name = "Bongo";
	dog2.breed = "Mops";
	dog2.color = "Black";
	dog2.age = 10;
	dog2.height = 15.3;
	dog2.gender = 'F';
	dog2.sleep();
	
	}
}
