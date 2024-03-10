package com.collection.class25.HW.Task2;

/*
2. Создайте класс CreditCard и определите переменные balance и interest.
      Создать метод экземпляра, который будет рассчитывать проценты на основе заданного баланса.
    - Создать 2 подкласса: Visa и AX. В классе AX переопределить метод calculate interest.
    - Вызовите метод, создав объект каждого из трех классов.
 */
public class CreditCard {
    double balance;
    double interest;

   CreditCard(double balance) {
        this.balance = balance;

    }

    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("Родительский Годовой процент составляет " + interest);
    }
}

class Visa extends CreditCard{

    Visa(double balance) {
        super(balance);
    }
}
class AX extends CreditCard{
    AX(double balance) {
        super(balance);

    }

    void myOwnMethod(){
        System.out.println("Child method");
    }

    void calculateInterest(){
        interest=balance*0.10;
        System.out.println("Годовой процент составляет " + interest);
    }
}
