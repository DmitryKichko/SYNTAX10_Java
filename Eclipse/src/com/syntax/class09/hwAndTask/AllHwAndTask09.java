package com.syntax.class09.hwAndTask;

public class AllHwAndTask09 {

    public static void main(String[] args) {


        /**
         * Создайте массив символов и занесите в него оценки: A, B, C, D, E, F.
         *
         *  - Затем вывести оценку B
         */

        char[] names = new char[6];

        names[0] = 'A';
        names[1] = 'B';
        names[2] = 'C';
        names[3] = 'D';
        names[4] = 'E';
        names[5] = 'F';

        System.out.println(names[1]);


        /**
         * Создайте массив names и сохраните в нем все имена вашей группы.
         *
         * - Затем выведите свое имя из этого массива.
         */

        String[] syntaxfc = new String[8];
        syntaxfc[0] = "Dmitry";
        syntaxfc[1] = "Sule";
        syntaxfc[2] = "Blake";
        syntaxfc[3] = "Ana";
        syntaxfc[4] = "Enes";
        syntaxfc[5] = "Andrei";
        syntaxfc[6] = "Burju";
        syntaxfc[7] = "Gurkan";

        System.out.println(syntaxfc[0]);


        /**
         * Создать массив слов: Java, Суббота, день, кодирования.
         *
         * - Выведите следующее предложение, используя элементы массива:
         *  "Суббота - день кодирования Java".
         */

        String[] words = {"Java", "Суббота", "день", "кодирования"};

        System.out.println(words[1] + " - " + words[2] + " " + words[3] + " " + words[0]);


        /**
         * Получить все значения массива с помощью цикла for.
         *
         */

        String[] name = {"Jose", "Sule", "Blake", "Ana", "Enes", "Andrei", "Burju", "Gurkan", "Imam"};

        for (int a = 0; a < name.length; a++) {

            System.out.println(name[a]);

        }


        /**
         * Вывести значения массива в обратном порядке.
         *
         */

        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        for (int i = grades.length - 1; i >= 0; i--) {

            System.out.print(grades[i] + " ");
        }


    }
}
