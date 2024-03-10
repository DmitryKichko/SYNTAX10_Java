package com.collection.class25.HW.Task3;
/*
3. Создайте класс Student, который будет иметь три подкласса: SyntaxStudent, CollegeStudent, SchoolStudent.
- Определите общее поведение в родительском классе и переопределите некоторые методы в дочерних классах
- Определите некоторые методы, специфичные для дочерних классов.
- Напишите пример достижения полиморфизма во время выполнения
 */
public class Student {

    void study(){
        System.out.println("Студент должен учиться");
    }

    void doHomeWork(){
        System.out.println("Студент должен выполнять домашние задания");
    }

    void practice(){
        System.out.println("Студент должен практиковаться");
    }


     class SyntaxStudent extends Student{

        void study(){
            System.out.println("Студенты Syntax должны хорошо учиться, чтобы быстро получить работу");
        }

        void doHomeWork(){
            System.out.println("Студенты должны выполнять домашние задания по программированию");
        }

        void doResearch(){
            System.out.println("Syntax Студенты должны проводить исследования в google и смотреть видео на youtube");
        }
    }

    class CollegeStudent extends Student{

        void doHomeWork(){
            System.out.println("Студенты колледжа должны выполнять домашние задания, чтобы получать хорошие оценки");
        }
    }

    class SchoolStudent extends Student{


    }

}
