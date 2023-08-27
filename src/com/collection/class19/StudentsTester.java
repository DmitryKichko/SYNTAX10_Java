package com.collection.class19;

public class StudentsTester {

    public static void main(String[] args) {

        Students students1 = new Students("Dimon", 3.4,4,4.5);

        students1.numPrintInfo();

        Students students2 = new Students("Andry", 4,4,4.5);

        students2.numPrintInfo();

        Students students3 = new Students("Vasy", 5,5,5);

        students3.numPrintInfo();

        Students students4 = new Students("Nasty", 4,3.4,3);

        students4.numPrintInfo();

        Students students5 = new Students("Vasy", 5,3.5,4);

        students5.numPrintInfo();
    }
}
