package com.collection.class27.demo1;

public abstract class Vehicle {

    String vinNumber;
    static int totalNumberOfVehicles;

    Vehicle(String vinNumber){
        this.vinNumber = vinNumber;
        totalNumberOfVehicles++;
        System.out.println("Vehicle - конструктор");
    }

    static void displayedTotalVehicles(){
        System.out.println("Мы создаем " + totalNumberOfVehicles + " Транспортные средства");
    }

    public void drive(){
        System.out.println("Мы можем водить транспортное средство");
    }

    public void stop(){
        System.out.println("транспортное средство может остановиться");
    }

    public abstract void start();
    abstract void speed();
}

    abstract class  Car extends Vehicle{

    String carType;

        Car(String carType, String vinNumber) {
            super(vinNumber);
            this.carType=carType;
            System.out.println("Car - конструктор");
        }

        @Override
        public void speed(){
            System.out.println("максимальная скорость 40 км/ч");
        }
        public abstract void breaking();
    }




    class BMW extends Car{
    String make;
    String model;
    BMW(String make, String model, String vinNumber, String carType){
        super(carType,vinNumber);
        System.out.println("BMW - конструктор");
    }

    @Override
        public void start(){
        System.out.println("BMW может начать движение");
    }
    @Override
        public void breaking(){
        System.out.println("BMW может сломаться");
    }
    public void displayInfo(){
        System.out.println("Мы строим  " + make + " "+ model+" по типу автомобиля "+carType+" с Vin-номером "+ vinNumber);
    }
    }

    class Toyota extends Car{
    String make;
    String model;

    Toyota(String make, String model, String carType, String vinNumber){
        super(carType, vinNumber);
        this.make=make;
        this.model=model;

    }
    @Override
    public void start(){
        System.out.println("Toyta - может заводиться");
    }

        @Override
        public void breaking() {
            System.out.println("Toyta - может ломаться");
        }
        public void displayInfo(){
            System.out.println("Мы строим  " + make + " " + model+ " по типу автомобиля " + carType + " с Vin-номером " + vinNumber);
        }
    }

