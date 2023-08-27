package com.company.class2624.abstractiondemo;

public abstract class Phone {
    private String make;
    String model;

    public void makePhoneCall(){
        System.out.println("Calling");
    }
    public void sendSMS(){
        System.out.println("Sending a massage");
    }
    protected abstract void takePictures();
    public abstract void unlock();
}
class Iphone extends Phone implements CallAble{
    @Override
    public void takePictures(){
        System.out.println("Take pictures with 12Mega pixel camera");
    }
    public void unlock(){
        System.out.println("unlocks with face id");
    }

    @Override
    public void method() {
        System.out.println("this devise can make phone calls");
    }
}

class Samsung extends Phone{
    public void takePictures(){
        System.out.println("Take pictures with 100 Megapixels camera");
    }
    public void unlock(){
        System.out.println("unlock with fingerprint");
    }
}
