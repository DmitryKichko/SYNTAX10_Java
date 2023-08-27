package com.company.class16;

public class SyntaxStudentTester {
    public static void main(String[] args) {
        SyntaxStudents student1=new SyntaxStudents();
        student1.name="Serge";
        student1.age=22;
        student1.id="123";

        student1.displayFee();
        SyntaxStudents.schoolName="Syntax techs";
        System.out.println(SyntaxStudents.schoolName);


        SyntaxStudents student2=new SyntaxStudents();
        student1.name="Elizabeth";
        student1.age=18;
        student1.id="2345";
        System.out.println(SyntaxStudents.schoolName);


    }
}
