package com.company.class2523.catingdemo;

public class Tester {
    public static void main(String[] args) {
        Father container=new Son("Abdul");
        container.eat();
        container.sleep();
        ((Son)container).playGamesOnComputer();
        container=new Fawad("Fawad");
        container.eat();
        container.sleep();


        Object[] object={"ksdjks",1215,'A',false};

    }
}
