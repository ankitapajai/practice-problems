package com.bootcoding.practice.problems.OopsConcept.inheritance;

//single inheritance in java..
//
public class Animal {
    void eat(){
        System.out.println("the dog is eating");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("the dog is running");
    }
}
class TestProgram{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.eat();
    }
}

