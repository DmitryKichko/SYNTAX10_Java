package com.collection.class27.encapsulation;

public class Person {

   private String name;
   private int age;
   private int weight;
   private int height;

   public void setName(String name){
       if (name.length()<15){
           this.name = name;
       }else {
           System.out.println("Это запрещено, необходимо использовать не более 15 символов");
       }
   }

   public void setAge(int age){

       if (age>0 && age<120){
           this.age = age;
       }else {
           System.out.println("возраст за пределами доступного");
       }
   }

   public void setWeight(int weight){
       if(weight>0&&weight<150){
           this.weight=weight;
       }else {
           System.out.println("вес за пределами доступного");
       }
   }

   String getName(){
       return name;
   }


    void printInfo(){

       if (age==0){
           System.out.println("какае-то ошибка");
       }else {
           System.out.println("Имя "+name+" восраст "+age+" weight " + weight +" height " + height);
       }

    }
}
