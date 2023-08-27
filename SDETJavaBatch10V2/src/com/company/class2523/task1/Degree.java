package com.company.class2523.task1;

public class Degree {
    /*
   1. Create a class 'Degree' having a method 'getPrerequisite' that prints ""
    To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'. In Masters class
    override method 'getPrerequisite'.

   1. Создайте класс 'Degree' с методом 'getPrerequisite', который печатает ""
    Для получения степени вам необходим диплом средней школы"".
    Класс 'Degree' имеет 2 подкласса, а именно 'Bachelors' и Masters'. В классе Masters
    переопределить метод 'getPrerequisite'.
     */
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println("To get a Masters degree you need a Bachelors degree first");
    }
}