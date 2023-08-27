package com.company.class17;

public class StaticDemo {
    String name="BlaBla";
    static String country="USA";
    void method1(){
        System.out.println(name);
        System.out.println(country);
    }

    public static void main(String[] args) {
    method2();
        System.out.println("This is static instance " + country);
        StaticDemo staticDemo=new StaticDemo();
        System.out.println("This is just instance variable " + staticDemo.name);

    }
   static void method2(){
       //System.out.println(name); name is an instance field and its value can
       //vary from object to object
       // (имя - это поле экземпляра, и его значение может меняться от объекта к объекту)
       // method1(); can not use directly must create an object first (не может использоваться напрямую, сначала необходимо создать объект)

       String name1="jjdjd";
       StaticDemo staticDemo=new StaticDemo();
       System.out.println(staticDemo.name);
       staticDemo.method1();
       method3();
       System.out.println("This is local variable " + name1);

   }
   static void method3(){
       System.out.println("static method 3");

   }
}
