package com.collection.class26.abstraction;

public class PhoneTester {

    public static void main(String[] args) {

     //   Phone phone = new Phone();  //используя абстракцию мы не можем создавать объект

        Phone phone = new Samsung();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();


        CallAble callAble = new Iphone();
        callAble.method();

    }
}
