package com.company.class2321.task1;

public class UserInfo extends UserClass{
    String address;

    UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println(name+ " "+mobileNumber+" "+address);
    }

    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("Mesoud","12346",
                "afkabf");
        userInfo.userDetails();
    }
}
