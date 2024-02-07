package com.bootcoding.practice.problems.OopsConcept.inheritance;

/*
In java inheritance is the most powerful concepts ...in which one objects acquire all the properties
and behaviour of parent object.
*/
public class Employee {
    float salary = 40000;
}
class Programmer extends Employee{
    float bonus = 10000;
}

class TestCode{
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("The salary of employee is: " + p.salary);
        System.out.println("The bonus of programmer is: " + p.bonus);
    }
}

