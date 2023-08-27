package com.syntax.class12;

public class Dog {

	
	
	String name;
	String breed;
	String color;
	int age;
	double height;
	char gender;
	
	void bark() {
		System.out.println("Собака может лаять");
	}
	
	void sleep() {
		System.out.println("Собака может спать");
	}
	
	
	public static void main(String[] args) {
		
		Dog dog1= new Dog();
		dog1.name="Джеймс";
		dog1.breed="Бульдог";
		dog1.color="Белый";
		dog1.age=20;
		dog1.height=15;
		dog1.gender='M';
		
		dog1.bark();
		dog1.sleep();
		
		Dog dog2= new Dog();
		dog2.name="Бонго";
		dog2.breed="шпиц";
		dog2.color="голубой";
		dog2.age=100;
		dog2.height=10;
		dog2.gender='M';
		dog2.sleep();

	}

}
