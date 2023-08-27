package com.company.class2624.abstractiondemo;

public class PhoneTester {
    public static void main(String[] args) {
       // Phone phone=new Phone(); CE Невозможно создать объект напрямую

        Phone phone=new Samsung();
        phone.makePhoneCall();
        phone.sendSMS();
        phone.takePictures();
        phone.unlock();

        CallAble callAble=new Iphone();




    }
}
