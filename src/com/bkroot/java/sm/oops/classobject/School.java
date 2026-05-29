package com.bkroot.java.sm.oops.classobject;

public class School {
    String name;
    int age;

    void study()
    {
        System.out.println(name + " is playing ");
    }

    public static void main(String[] args) {
        School s1 = new School();
        s1.name = "Shiva";
        s1.age = 21;
        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.study();

    }
}
