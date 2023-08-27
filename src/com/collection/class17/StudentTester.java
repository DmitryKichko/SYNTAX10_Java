package com.collection.class17;

public class StudentTester {

    public static void main(String[] args) {

        Student student = new Student();

        student.studentName = "Лина";
        student.studentID = "3526636kf";
        Student.numberOfStudents++;

        Student student1 = new Student();

        student1.studentName = "Майк";
        student1.studentID = "36374638lir";
        Student.numberOfStudents++;

        Student student2 = new Student();

        student2.studentName = "Стилор";
        student2.studentID = "3631231kflir";
        Student.numberOfStudents++;

        System.out.println(Student.numberOfStudents);

    }
}
