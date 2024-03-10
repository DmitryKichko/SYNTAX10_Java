package com.collection.class24.recap;

public class Overloading {

    void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method withString arg");
        main("Strimernnnnnmziodi");
        main(10);
    }

    public static void main(int args) {
        System.out.println("Inside the main method withString arg");
    }
    public static void main(String args) {
        System.out.println("Inside the main method withString arg");
    }


}
