package com.company.class2523.task2;

public class Tester {
    public static void main(String[] args) {
        /*CreditCard creditCard=new CreditCard(1000);
        //creditCard.calculateInterest();
        Visa visa=new Visa(1000);
        //visa.calculateInterest();
        AX ax=new AX(1000);
        ax.calculateInterest();*/
        CreditCard creditCard1=new AX(120);
        creditCard1.calculateInterest();
        //creditCard1.myownMethod();
        // not allowed (не разрешается)

      //  AX ax=(AX)new CreditCard(12);
        //Run time error not possible with non-primitive
        //Ошибка времени выполнения невозможна при использовании не примитива
        AX ax2=(AX)creditCard1;


    }
}
