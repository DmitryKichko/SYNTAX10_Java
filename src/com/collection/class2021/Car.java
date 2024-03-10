package com.collection.class2021;

public class Car {
    String model;
    String make;
    int year;

    Car(){
        System.out.println("Конструктор с 0 параметром");
    }

    Car(String model){
        this();
        this.model=model;
        this.make="none";
        this.year=0;
        System.out.println("Конструктор с 1 параметрами");
    }
    Car(String make, String model){
        this(model);
        this.make = make;
        this.year = 0;
        System.out.println("Конструктор с 2 параметрами");
    }
    Car(String make, String model, int year){
        this(make, model);
        this.year = year;
        System.out.println("Конструктор с 3 параметрами");
    }

    void printInfo(){
        String make="Honda";
        String model = "Civic";
        int year = 2023;
        System.out.println(this.make+" "+model+" "+this.year);
    }
}
