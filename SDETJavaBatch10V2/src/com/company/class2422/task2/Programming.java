package com.company.class2422.task2;

public class Programming {
    /*
    Create a class named 'Programming'.
    While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages"
    should be printed. If some String is passed to it, then in place of "programming
    languages" the value variable should be printed. Example, if we pass "Java", then
    "I love Java" should be printed.

    Создайте класс с именем 'Programming'.
    При создании объекта класса,
    если ему ничего не передано, то сообщение "Я люблю языки программирования"
    должно быть выведено. Если ему будет передана некоторая строка, то вместо "языки программирования
    languages" должно быть выведено значение переменной. Например, если мы передадим "Java", то
    должно быть выведено сообщение "Я люблю Java".
     */
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String value){
        System.out.println("I love "+value);

    }

    public static void main(String[] args) {
      new Programming();
       new Programming("Python");
       // new Programming("Python"); ошибка, потому что нет подходящего конструктора
    }
}
