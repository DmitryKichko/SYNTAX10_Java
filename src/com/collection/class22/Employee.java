package com.collection.class22;

public class Employee extends Person{
    Employee(String name, int age, double height, double weight){
        super(name, age, height, weight);
    }
    Employee(String name, int age){
        super(name, age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Oxana", 16, 5.5,35);
        employee.eat();
        employee.sleep();
        System.out.println(employee.name);
    }
}
