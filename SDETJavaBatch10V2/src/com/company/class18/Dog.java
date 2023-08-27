package com.company.class18;

public class Dog {
    String name;
    int age;
    double height;
    double weght;
    String bread;
    String color;
    static int noOfLegs=4;
Dog(){
    name="None";
    age=10;
    height=10;
    weght=10;
    bread="Name";
    color="Name";
    }
    Dog(String dogName){
        // constructor 1
        name=dogName;
        age=10;
        height=10;
        weght=10;
        bread="Name";
        color="Name";

    }

    Dog(String dogName,int dogAge) {
        //constructor 2
        name = dogName;
        age=dogAge;
        height = 10;
        weght = 10;
        bread = "Name";
        color = "Name";

    }
    Dog(String dogName,int dogAge,double dogheight) {
        //contructor 3
        name = dogName;
        age=dogAge;
        height = dogheight;
        weght = 10;
        bread = "Name";
        color = "Name";

    }
    Dog(String dogName,int dogAge,double dogheight,double dogWeight) {
        //contructor 4
        name = dogName;
        age = dogAge;
        height = dogheight;
        weght = dogWeight;
        bread = "Name";
        color = "Name";
    }
    Dog(String dogName,int dogAge,double dogheight,double dogWeight,String dogBread) {
        //contructor 5
        name = dogName;
        age = dogAge;
        height = dogheight;
        weght = dogWeight;
        bread = dogBread;
        color = "Name";
    }


    Dog(String dogName, int dogAge,double dogHeight, double dogWeight,String dogBreed,String dogColor) {
        name = dogName;
        age = dogAge;
        height = dogHeight;
        weght = dogWeight;
        bread = dogBreed;
        color = dogColor;
    }
    void printDogInfo(){
        System.out.println("Name "+name+" Age "+age+" Height "+height+" Breed "+bread+" color "+color);
    }
}
