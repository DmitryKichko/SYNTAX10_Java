package com.collection.class25.HW.Task1;

/*
1. Создайте класс 'Degree', имеющий метод
       'getPrerequisite', который выводит: "Для получения степени необходим аттестат о среднем образовании".
       - Класс 'Degree' имеет 2 подкласса, а именно
       'Bachelors' и 'Masters'. В классе Masters переопределить метод 'getPrerequisite'.
       - Вызовите метод, создав объект каждого из трех классов.
 */
public class Degree {

    void getPrerequisite() {
        System.out.println("Для получения степени необходим аттестат о среднем образовании");
    }
}
    class Bachelors extends Degree{

    }
    class Masters extends Degree{
    @Override
        void getPrerequisite(){
            System.out.println("Для получения степени необходим");
        }

        public static void main(String[] args) {

            Degree degree = new Degree();
            degree.getPrerequisite();

            Bachelors bachelors = new Bachelors();
            bachelors.getPrerequisite();

            Masters masters = new Masters();
            masters.getPrerequisite();
        }
    }


