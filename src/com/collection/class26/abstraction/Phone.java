package com.collection.class26.abstraction;

import java.sql.SQLOutput;

public abstract class Phone {

    public void makePhoneCall(){

        System.out.println("Звонок");
    }
    public void sendSMS(){
        System.out.println("Отправка сообщений");
    }
    public abstract  void takePictures();
    public abstract void unlock();
}

class Iphone extends Phone implements CallAble{
    @Override
    public void takePictures(){
        System.out.println("Фотосъемка с помощью 12-мегапиксельной камеры");
    }

    public void unlock(){
        System.out.println("Разблокировка с помощью функции faceID");
    }

    @Override
    public void method() {
        System.out.println("спомощью этого устройства можно звонить");
    }
}

class Samsung extends Phone{
    @Override
    public void takePictures(){
        System.out.println("Фотосъемка с помощью 108-мегапиксельной камеры");
    }
    public void unlock(){
        System.out.println("Разблокировка с помощью функции отпечатка пальца");
    }

}
