package com.company.class2221;

public class Employee extends Person{
    Employee(String name, int age, double height, double weight){
        super(name, age, height, weight); // must be the first line (должна быть первой строкой)
        //super(name, age, height, weight); can only use once (можно использовать только один раз)
    }
    Employee(String name, int age, double height){
        super(name, age, height); // must be the first line (должна быть первой строкой)
        //super(name, age, height, weight); can only use once (можно использовать только один раз)
    }
    void getPaid(){
        // super("name", 10, 10, 10); not allowed
    }

    public static void main(String[] args) {
        Employee employee= new Employee("Oxana", 16, 5.5, 35);
        employee.eat();
        employee.sleep();
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.height);
        System.out.println(employee.weight);
    }
}
