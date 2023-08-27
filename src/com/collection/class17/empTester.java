package com.collection.class17;

public class empTester {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.empId = "132";
        employee.salary = 100000;

        System.out.println(employee.empId);
        System.out.println(employee.salary);
        System.out.println(Employee.CEO);

        Employee employee1 = new Employee();
        employee1.empId = "435";
        employee1.salary = 60092;

        System.out.println(employee1.empId);
        System.out.println(employee1.salary);
        System.out.println(Employee.CEO);
    }
}
