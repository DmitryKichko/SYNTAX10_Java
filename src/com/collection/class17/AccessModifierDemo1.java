package com.collection.class17;

public class AccessModifierDemo1 {


    private String name;
    int age; // если мы не указываем модификатор доступа то по умолчанию он доступен в пределах того же пэкеджа того же классу

    public double height;

    protected String city;


   private void method1(){          //private
        System.out.println(name);
        System.out.println(age);
    }
    void method2(){                 //default
        System.out.println(name);
        System.out.println(age);
        method1();
    }

    public void method3(){           //public
        method4();
       System.out.println(height);
    }
    protected void method4() {       //protected
        System.out.println(name);
        System.out.println(age);
    }

        public static void main (String[]args){

            // System.out.println(name); - мы не можем получить доступ так как это статический метод
            // нужно создать объект внуктри класса в котором он объявлен

            AccessModifierDemo1 accessModifierDemo1 = new AccessModifierDemo1();

            accessModifierDemo1.name = "Sergey";

            System.out.println(accessModifierDemo1.name);
            System.out.println(accessModifierDemo1.name);
            accessModifierDemo1.method1();
            accessModifierDemo1.method4();
        }
    }
