package com.bkroot.java.sm.oops.constructor;
// with variable
public class Self {

    String name;
    int age;

    Self()
    {
//        System.out.println();
        name = "Shiva";
        age = 21;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Self s = new Self();
        s.display();
    }

}
