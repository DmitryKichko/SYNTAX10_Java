package com.company.class17;

public class AccessModifiedDemo1 {
   private String name;   // Private сработает только в данном классе, в новом классе он не сработает
   int age;
   public double height;
      protected String city;




   private void method1(){
       System.out.println(name);
       System.out.println(age);
   }
    void method2(){
        System.out.println(name);
        System.out.println(age);
        method1();
    }
    protected void method4(){
        System.out.println(name);
        System.out.println(age);
    }
    public void method3(){
       method4();
        System.out.println(age);
        System.out.println(height);
    }
    public static void main(String[] args) {
       // System.out.println(name); because main is a static method
        AccessModifiedDemo1 accessModifiedDemo1= new AccessModifiedDemo1();
        System.out.println(accessModifiedDemo1.name);
        System.out.println(accessModifiedDemo1.age);
        accessModifiedDemo1.method1();
        accessModifiedDemo1.method4();
    }
}
