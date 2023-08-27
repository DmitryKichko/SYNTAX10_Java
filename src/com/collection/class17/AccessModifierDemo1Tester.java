package com.collection.class17;

public class AccessModifierDemo1Tester {


    public static void main(String[] args) {

        AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();

        //   System.out.println(accessModifierDemo1.name);
        // не могу получить доступ так как поле объявлено private

        System.out.println(accessModifierDemo1.age);
        // может получить доступ, потому что он не является приватным и имеет доступ по умолчанию,
        // что означает, что мы можем получить к нему доступ внутри того же пакета
        // также

        // accessModifierDemo1.method1();
        // error because method one is private

        accessModifierDemo1.method4();


    }
}
