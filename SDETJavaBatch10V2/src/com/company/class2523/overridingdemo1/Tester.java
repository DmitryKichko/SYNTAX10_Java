package com.company.class2523.overridingdemo1;

public class Tester {


    public static void main(String[] args) {
        Employee employee=new Employee("Abudul");
        employee.performDailActivities();
        Student student=new Student("Sharif");
        student.performDailActivities();
        Teacher teacher=new Teacher("Asghar");
        teacher.performDailActivities();
    }
}
