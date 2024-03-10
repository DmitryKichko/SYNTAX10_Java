package com.collection.class24.Task2;

/*
Создать 1 класс, в котором создать метод, который будет вычислять площадь:
- Прямоугольника
- Квадрата
- Куба
Используйте отдельный класс для тестирования кода
 */
public class CalculateArea {

    void calculateArea(double lenght, double width){
        System.out.println("Площадь  "+ (lenght*width));
    }
    void calculateArea(double lenght){
        System.out.println("Площадь  "+ (lenght*lenght));
    }

    void calculateArea(double lenght, double width, double height){
        System.out.println("Площадь "+ (lenght*width*height));
    }

    public static void main(String[] args) {
        CalculateArea calculateArea = new CalculateArea();
        calculateArea.calculateArea(10);
        calculateArea.calculateArea(10,10);
        calculateArea.calculateArea(10,15,10);
    }
}
