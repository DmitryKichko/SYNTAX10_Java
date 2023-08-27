package com.company.class3129;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedClassInSet {
    public static void main(String[] args) {

        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("Andrei", 101));
        students.add(new Student("Olena", 102));
        students.add(new Student("Serge", 103));
        students.add(new Student("Elizabeth", 104));
        students.add(new Student("Dillnoza", 105));

        System.out.println(students.size());

        Iterator <Student> it = students.iterator();
        while(it.hasNext()) {
           Student el = it.next();
          String name = el.name;
           int id = el.studentID;
            System.out.println(name + " id is " + id);
        }

        System.out.println(" ------------------------------------------ ");

        Iterator<Student> iter = students.iterator();
        while(iter.hasNext()) {
            Student stu = iter.next();
            System.out.println(stu.name + " id is " + stu.studentID);
        }
    }
}
