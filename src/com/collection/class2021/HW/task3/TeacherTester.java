package com.collection.class2021.HW.task3;

public class TeacherTester {

    public static void main(String[] args) {

        ChemTeacher chemTeacher = new ChemTeacher();
        chemTeacher.name="Michael";
        chemTeacher.teach();
        PionoTeather pionoTeather = new PionoTeather();
        pionoTeather.name = "Sharif";
        pionoTeather.teachPiano();
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Jamolidin";
        mathTeacher.teachMath();
    }
}
