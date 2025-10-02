package com.syntax.class10;

public class TwoDArrayExample {

    public static void main(String[] args) {

        String[][] food = {
                {"Борщ", "Вареники", "Драники"},
                {"Кебаб", "Палау", "Манты"},
                {"Такос", "Бурито", "кесо", "сальса"},
                {"Паста", "Пицца", "Хлеб", "Ризотто"}
        };
        System.out.println(food.length); // --> Общее количество массивов
        int sizeOf1Array = food[0].length;
        System.out.println(sizeOf1Array);

        int sizeOf2Array = food[1].length;
        System.out.println(sizeOf2Array);

        System.out.println(food[2][1]);
        System.out.println(food[3][2]);

        // Как получить все значения из двумерного 2D массива

        for (int i = 0; i < food.length; i++) {            // Итерация по строкам/массивам

            for (int j = 0; j < food[i].length; i++) {    // Перебор столбцов/каждого элемента из массива


            }
        }


    }
}
