package com.company.class2725.demo1;

public abstract class Vehicle {
    String vinNumber;
    static int totalNumberOfVehicle;
    Vehicle(String vinNumber){
        this.vinNumber=vinNumber;
        totalNumberOfVehicle++;
        System.out.println("Vehicle constructor");
    }

    private void display(){

    }
    static void displayTotalVehicles(){
        System.out.println("We build "+totalNumberOfVehicle+" Vehicles");
    }
    public void drive(){
        System.out.println("we can drive Vehicle ");
    }
    protected void stop(){
        System.out.println("Vehicle can stop");
    }
    public abstract void start();
    abstract void speed();
    //public static abstract void gps(); не разрешается
    //private abstract  void gps(); не разрешается
    //final abstratc coid gps(); не разрешается
}
abstract class Car extends Vehicle{
    String carType;
    Car(String carType, String vinNumber){
        super(vinNumber);
        this.carType=carType;
        System.out.println("Car constructor");
}
@Override
    public void speed(){
    System.out.println("Max speed is 400");
}
public abstract void breaking();
}
class BMW extends Car{
    String make;
    String model;
    BMW(String make, String model, String vinNumber, String carType){
        super(carType, vinNumber);
        System.out.println("BMW constructor");
    }
    public void start(){
        System.out.println("BMW can start remotely");
    }
    public void breaking(){
        System.out.println("BMW can break");
    }
    public void displayInfo(){
        System.out.println("We build "+make+" "+model+"with car type "+carType+" with VinNumber"+vinNumber);
    }
}
    class Toyota extends Car{
        String make;
        String model;
        Toyota(String make, String model, String carType, String virNumber){
            super(carType, virNumber);
            this.make=make;
            this.model=model;
        }
        public void start(){
            System.out.println("Toyota can start remotely");
        }
        public void breaking(){
            System.out.println("Toyota can break");
        }

        public void displayInfo(){
            System.out.println("We build "+make+" "+model+"with car type "
                    +carType+" with VinNumber"+vinNumber);
        }
    }

