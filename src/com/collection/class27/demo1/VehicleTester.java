package com.collection.class27.demo1;

public class VehicleTester {

    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "X5", "123", "Sedan");

        bmw.drive();
        bmw.start();
        bmw.stop();
       // bmw.toString();
        bmw.displayInfo();
        Vehicle.displayedTotalVehicles();

        Car car = new Toyota("Toyota","yaris","Sedan", "486");

        ((Toyota)car).displayInfo();
    }
}
