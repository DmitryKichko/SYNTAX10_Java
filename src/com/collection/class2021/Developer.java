package com.collection.class2021;

public class Developer extends Employee{

    String programmingLanguage;

    void code(){
        System.out.println("Developer имеет возраст id " + empId + " age "+age+ " может програмировать "+ programmingLanguage);
    }

    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.empId = "123";
        developer.age = 50;
        developer.programmingLanguage = "Java";
        developer.code();
        developer.wolk();
        developer.sleep();
    }

}
