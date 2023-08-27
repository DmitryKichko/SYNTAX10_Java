package com.collection.class17;

public class StaticDemo {

    String name = "blajsj";
    static String country = "Russia";

    void method1() {

        System.out.println(name);
        System.out.println(country);
    }

    static void method2() {
        System.out.println(country);

        // name - это поле экземпляра, и его значение может меняться от объекта к объекту
        // method1(); не может использоваться напрямую, сначала необходимо создать объект

        StaticDemo staticDemo = new StaticDemo();

        System.out.println(staticDemo.name);
        staticDemo.method1();
        method3();


    }
    static void method3(){

    }

}
