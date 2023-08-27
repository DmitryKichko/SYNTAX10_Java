package com.company.class2523.task2;

public class CreditCard {

    double balance;
    double interest;
    CreditCard(double balance){
        this.balance=balance;
    }
    /*
    2. Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.

    2. Создайте класс CreditCard и определите переменные balance и interest.
    Создайте метод экземпляра, который будет вычислять проценты на основе заданного баланса.
    Создайте 2 подкласса: Visa и AX. В классе AX переопределите метод calculate interest.
    Вызовите метод, создав объект каждого из трех классов.
     */
    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("From parent Yearly interest is "+interest);
    }
}
class  Visa extends CreditCard{
    Visa(double balance) {
        super(balance);
    }

    void calculateInterest(){
        interest=balance*0.12;
        System.out.println("Yearly interest is "+interest);
    }
}
class AX extends CreditCard{
    AX(double balance) {
        super(balance);
    }
    void myownMethod(){
        System.out.println("child method");
    }

    void calculateInterest(){
        interest=balance*0.10;
        System.out.println("Yearly interest is "+interest);
    }
}
