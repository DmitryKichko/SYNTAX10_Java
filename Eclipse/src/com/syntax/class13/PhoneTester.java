package com.syntax.class13;

public class PhoneTester {

	public static void main(String[] args) {
	
		Phone iphone = new Phone();
		iphone.camera=12;
		iphone.make="Apple";
		iphone.model="Iphone 12";
		iphone.is5G=true;
		iphone.screenSize=6.7;
		iphone.makeCall();
		iphone.takePictures();
	}

}
