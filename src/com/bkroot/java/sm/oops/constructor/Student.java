package com.bkroot.java.sm.oops.constructor;

public class Student {
    String name;
    int age;

    Student(String n, int a)
    {
    name = n;
    age= a;
    }
    void display()
    {
        System.out.println("My name is " +name+ " age is " +age);
    }

    public static void main(String[] args) {
        Student s = new Student("Shiva" , 21);
        s.display();
    }
}
