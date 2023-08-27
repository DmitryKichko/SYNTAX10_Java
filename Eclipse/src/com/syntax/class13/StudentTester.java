package com.syntax.class13;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		
	
	Student Michael=new Student();
	Michael.name="Michael";
	Michael.id="123";
	Michael.gender='M';
	Michael.school="Syntax";
	Michael.tutition=1000;
	Michael.study();
	Michael.payTuition();
	
	Student Anne=new Student();
	Anne.name="Anne Mary";
	Anne.school="Syntax";
	Anne.tutition=1000;
	Anne.study();
	Anne.payTuition();
	
	Scanner scan= new Scanner(System.in);
	scan.next();
	
	
	
	
}
}