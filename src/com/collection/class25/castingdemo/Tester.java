package com.collection.class25.castingdemo;

public class Tester {


    public static void main(String[] args) {

        Abdullah abdullah = new Abdullah("Abdullah");

        abdullah.eat();
        abdullah.sleep();

        // Abdullah[] abdullahsArray = new Abdullah[5];
        // Abdul abdul1 = (Abdul) abdullah;

       /* abdul1.playGamesOnComputers();
        abdul1.sleep();
        abdul1.eat(); */


        Abdul abdul = new Abdul("Abdul");

        abdul.eat();
        abdul.sleep();
        abdul.playGamesOnComputers();

        Fawad fawad = new Fawad("Fawad");

        fawad.eat();
        fawad.sleep();

        abdullah=new Fawad("Fawad1");

        Object[] objects = {"jkdfjfd", 123451, false};


    }
}
