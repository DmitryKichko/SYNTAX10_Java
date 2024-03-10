package com.collection.class1920;

import com.collection.class2021.Person;

public class EmployeeFromOtherP extends Person {
    String empId;
    double salary;
    void wolk(){
        System.out.println("Employee " + empId + " имеет рост " + height + "Работает");
    }
    void getPaid(){
        System.out.println(empId+ " может платить " + salary);
    }
    public static void takeLeaves(){
        System.out.println("Сотрудники могут взять отпуск");
    }
}
