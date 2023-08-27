package com.company.class16;

import com.company.class17.AccessModifiedDemo1;

public class AccessModifierDemo1Tester extends AccessModifiedDemo1{

    void methodInSeparateClass(){
       // System.out.println(name);
       // System.out.println(age);
        System.out.println(city);
        System.out.println(height);
        method4();

    }
    
    public static void main(String[] args) {
        AccessModifiedDemo1 accessModifiedDemo1 = new AccessModifiedDemo1();
        //System.out.println(AccessModifiedDemo1.name);
        /*
        Can not access because default works in same package only
         */
       // accessModifiedDemo1.method2();
        accessModifiedDemo1.method3();
        //accessModifiedDemo1.method4();
    }
}
