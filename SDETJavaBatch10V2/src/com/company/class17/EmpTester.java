package com.company.class17;

public class EmpTester {
    public static void main(String[] args) {
        Employee employee= new Employee();
        employee.empId="123";
        employee.salary=100000;
        System.out.println(employee.empId);
        System.out.println(employee.salary);
        System.out.println(Employee.GEO);
        //V2
        Employee employee1=new Employee();
        employee1.empId="456";
        employee1.salary=120000;
        System.out.println(employee1.empId);
        System.out.println(employee1.salary);
    }
}
