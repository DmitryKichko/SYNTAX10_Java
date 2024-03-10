package com.collection.class24.Task3;

/*
Создайте класс с именем 'Programming'.
- При создании объекта класса, если ему ничего не передается, то должно быть выведено сообщение "Я люблю языки программирования".
- Если ему передается некоторая строка String, то вместо "языков программирования" должно быть выведено значение переменной.
- Например, если передать "Java", то должно быть выведено сообщение: "Я люблю Java".
 */
public class Programming {

    Programming(){
        System.out.println("Я люблю языки программирования");
    }
    Programming(String value){
        System.out.println("I love "+value);
    }

    public static void main(String[] args) {
        Programming programming = new Programming();
        new Programming("Python"); // используется один раз, чтобы не сохранять его в памяти
    }
}
