package com.company.class17;

public class AccessModifierDemo1Tester {
    public static void main(String[] args) {
        AccessModifiedDemo1 accessModifierDemo1= new AccessModifiedDemo1();
       // System.out.println(accessModifierDemo1.name);
        // can not access because field is private
        // не может получить доступ, так как поле является частным
        System.out.println(accessModifierDemo1.age);
        // can access because is it not private and has default
        // access which means we can access it inside same package
        // as well
        // может получить доступ, потому что он не является приватным и имеет доступ по умолчанию,
        // что означает, что мы можем получить к нему доступ внутри того же пакета
        // также

       // accessModifierDemo1.method1();
        // error because method one is private
        accessModifierDemo1.method4();
        System.out.println(accessModifierDemo1.city);
    }
}
