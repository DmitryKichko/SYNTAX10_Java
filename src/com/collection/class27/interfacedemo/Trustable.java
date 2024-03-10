package com.collection.class27.interfacedemo;

public interface Trustable {

    void trust();
}
interface Bank extends Trustable{
     void hasChecking();
     void hasSaving();
     default void hasCreditCard(){
         System.out.println("Практически во всех банках есть кредитные карты");
     }
     static void depositMoney(){
         System.out.println("Вы можете разместить депозит в своем банке");
     }
}

class FinancialInstitution{
    public void financing(){
        System.out.println("Все финансовые институты занимаются финансовыми операциями");
    }
}

class BOA extends FinancialInstitution implements Bank{

    @Override
    public void trust() {
        System.out.println("You can trust BOA for your money");
    }

    @Override
    public void hasChecking() {
        System.out.println("BOA has 3 chrcking accounts");
    }

    @Override
    public void hasSaving() {
        System.out.println("BOA has 2 saving accounts");
    }
}