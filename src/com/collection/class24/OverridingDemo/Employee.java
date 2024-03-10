package com.collection.class24.OverridingDemo;

public class Employee {
    double salary;
    String name;
    Employee(String name, double salary){
        this.salary=salary;
        this.name=name;
    }
    void getPaid(){
        System.out.println(name + " позволяет платить " + salary+"/anum");
    }
}

class Constractor extends Employee{
    Constractor (String name, double salary){
        super(name, salary);
    }
   @Override
    void getPaid(){
        System.out.println(name + " позволяет платить " + salary+"/hourly");
    }
}

class FullTimeEmployee extends Employee{

    FullTimeEmployee(String name, double salary){
        super(name, salary);

    }

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Dmitry", 155);
        fullTimeEmployee.getPaid();

        Constractor constractor = new Constractor("Jesus",45);
        constractor.getPaid();
    }
}
