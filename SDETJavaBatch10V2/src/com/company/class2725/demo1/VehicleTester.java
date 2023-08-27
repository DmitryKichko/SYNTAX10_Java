package com.company.class2725.demo1;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("BMW", "X5", "123", "Sedan");
        bmw.drive();
        bmw.start();
        bmw.stop();
       // bmw.toString(); исходящие из класса Object, все классы автоматически
        // наследуют от этого класса
        bmw.displayInfo();
        Vehicle.displayTotalVehicles();

        Car car=new Toyota("Toyota", "Yaris","Sedan", "450");
        ((Toyota)car).displayInfo();
    }
}




