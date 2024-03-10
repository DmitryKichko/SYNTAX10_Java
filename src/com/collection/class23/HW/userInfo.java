package com.collection.class23.HW;

public class userInfo extends userClass {

    String address;

    userInfo(String name, String phoneNumber, String address) {
        super(name, phoneNumber);
        this.address = address;
    }

    void userDetails(){
        System.out.println(name+phoneNumber+address);
    }

    public static void main(String[] args) {

        userInfo user = new userInfo("Dina ","12324 ", "str45");

        user.userDetails();
    }
}
