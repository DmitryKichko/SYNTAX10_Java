package com.company.class3331;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        try{
            System.out.println(10/5);
        }catch (Exception e){
            System.out.println("This is not possible in java");
        }
        System.out.println("Line 1 after error");
        System.out.println("Line 2 after error");
        System.out.println("Line 3 after error");
        System.out.println("Line 4 after error");
        System.out.println("Line 5 after error");

    }
}
