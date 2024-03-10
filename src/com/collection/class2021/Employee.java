package com.collection.class2021;

public class Employee extends Person{

    String empId;
    double salary;
    void wolk(){
        System.out.println("Employee " + empId + " имеет возраст " + age);
    }
    void getPaid(){
        System.out.println(empId+ " может платить " + salary);
    }
}
