package com.collection.class23.superdemo;

public class Parent {

    String name = "akbulut";


    void printName(){
        System.out.println("Name is "+name);
    }

    void getMarried(){
        System.out.println(" мои дети выйдут замуж или женятся по моему выбору");
    }

}

class Child extends Parent{
    String name = "Enes";
    void printName(){
        String name = "Tesfaab";
        System.out.println("Name is "+name);
        System.out.println("Name is "+this.name);
        System.out.println("Name is "+super.name);
    }
    void getMarried(){
        System.out.println(" Но мне нравится другая или другой.");
    }
    void letsDoSomethingCrazy(){
        getMarried();
        this.getMarried();
        super.getMarried();
    }
}