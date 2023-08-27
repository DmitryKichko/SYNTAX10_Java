package com.collection.class16;

public class SyntaxStudentsTest {
    public static void main(String[] args) {

        SyntaxStudents student1 = new SyntaxStudents();
        student1.name = "Сергей";
        student1.age = 11;
        student1.id = "164747";

        student1.displayFee();
        SyntaxStudents.schoolName = "Syntax text";
        System.out.println(SyntaxStudents.schoolName);

        SyntaxStudents student2 = new SyntaxStudents();

        student2.name = "Лика";
        student2.age = 11;
        student2.id = "167";

        System.out.println(SyntaxStudents.schoolName);
    }
}
