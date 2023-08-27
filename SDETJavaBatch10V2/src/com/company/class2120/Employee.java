package com.company.class2120;

import com.company.class20.Developer;

public class Employee extends Person {

    String empId;
    double salary;
    void work(){
        System.out.println("Employee "+empId+" having age "+age+" is working");
    }
    void getPaid(){
        System.out.println(empId+" is paid "+salary);
    }
}
