package com.bkroot.java.sm.Basic.variable;

public class Locall {

    // class ke andar Method ke andar banta he or
    void test()
    {
        int age = 20;   // Local Variable
        System.out.println("My age is "  +age);
    }

    public static void main(String[] args) {
        int rollno = 101;
        System.out.println(rollno);
        Locall l = new Locall();
        l.test();
    }
}
