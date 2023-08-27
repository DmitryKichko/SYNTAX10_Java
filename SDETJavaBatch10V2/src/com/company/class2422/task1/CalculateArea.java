package com.company.class2422.task1;

public class CalculateArea {
    /*
    2. Create 1 class in which create a method that will calculate
     the area (volume in case of box) of:
      Rectangle
      Square
      Box
      Use separate class to test your code

      Создайте 1 класс, в котором созданный метод, будет вычислять
     площадь (объем в случае с кубом):
      Прямоугольника
      Квадрата
      Куба

      Используйте отдельный класс для тестирования вашего кода
     */
    void calculateArea(double length, double width){
        System.out.println("Area "+(length*width));
    }
    void calculateArea(double length){
        System.out.println("Area "+(length*length));
    }
    void calculateArea(double length, double width,double height){
        System.out.println("Area "+(length*width*height));
    }

    public static void main(String[] args) {
        CalculateArea calculateArea=new CalculateArea();
        calculateArea.calculateArea(10);
        calculateArea.calculateArea(10,10.2);
    }

}
