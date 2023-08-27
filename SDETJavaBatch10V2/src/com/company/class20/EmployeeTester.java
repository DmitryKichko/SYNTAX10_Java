package com.company.class20;

import com.company.class2120.Person;

public class EmployeeTester {
    public static void main(String[] args) {
        EmployeeFromOtherP employee=new EmployeeFromOtherP();
        // employee.name; can't access because its private and we are not inside the same class
        // (не может получить доступ, потому что он частный, и мы не в одном классе)
        // employee.age; can't access because it has default access modifier
        // (не может получить доступ, так как имеет модификатор доступа по умолчанию)
        // employee.height; can't access because no extends keyword
        // (не может получить доступ, потому что нет расширенного ключевого слова)
        employee.weight=50;
        employee.sleep();
       //  employee.eat(); can't access no extends keyword
        //  (не может получить доступ к расширенному ключевому слову )
        Person.run();
        EmployeeFromOtherP.run();
       //  Person.takeLeaves(); inheritance is one way we can not do that
        // (наследование - это один из способов, с помощью которого мы не можем этого сделать)
        employee.empId="123";
        EmployeeFromOtherP.takeLeaves();
    }


}
