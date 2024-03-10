package com.collection.class23.methodoverloading;

public class CalculatorTester {


    public static void main(String[] args) {

        /*Calculator calculator = new Calculator();
        calculator.addInt((int) 14.5,(int)14.5);*/

        ImprovedCalculate improvedCalculate = new ImprovedCalculate();
        improvedCalculate.add(15.0,14.5);
        improvedCalculate.add(15,14);
        int[] arr = {10,20,30};
        improvedCalculate.add(arr);
        improvedCalculate.add(15,14,15);
        improvedCalculate.add(15,14,14,13);
        improvedCalculate.add(15,14,12,12,13);
        improvedCalculate.add(15,14,12,32,43,54);
    }
}
