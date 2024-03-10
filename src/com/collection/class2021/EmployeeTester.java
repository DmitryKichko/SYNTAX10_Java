package com.collection.class2021;

public class EmployeeTester {

    public static void main(String[] args) {

        Person person = new Person();

        person.age = 10;
        person.eat();
        person.sleep();

        Employee employee = new Employee();
        employee.empId = "13";
        employee.age = 15;
        employee.salary = 100000;
        employee.wolk();
        employee.getPaid();
        employee.eat();
        employee.sleep();
    }
}
