package com.collection.class28;

public class Person {

    private String name;
    private int age;
    private String SSN;


    void setName(String name){
        if(name.length()<20){
            this.name=name;
        }else {
            System.out.println("Имя не может привешать больше 20 символов");
        }
    }

    void setAge(int age){
        if(age>0&&age<120){
            this.age=age;
        }else {
            System.out.println("возраст не может быть меньше 0 или больше 120");
        }
    }

    void setSSN(String SSN){
        if(SSN.length()>0 && SSN.length()<=9){
            this.SSN=SSN;
        }else {
            System.out.println("Ошибка SSN");
        }
    }
    String getName(){
        return name;
    }

    int getAge(String SSN){
        if(this.SSN.equals(SSN)){
            return age;
        }else {
            return 0;
        }
    }
    String getSSN(String password){
        if (password.equals("12345")){
            return this.SSN;
        }else  {
            return null;
        }
    }

}
