package com.collection.class1920;

import com.collection.class2021.Person;

public class EmployeeTester {
    public static void main(String[] args) {

        EmployeeFromOtherP employee = new EmployeeFromOtherP();

        employee.weight=50;
        employee.sleep();
        Person.run();
        EmployeeFromOtherP.run();
        employee.empId="123";

        EmployeeFromOtherP.takeLeaves();
    }
}
