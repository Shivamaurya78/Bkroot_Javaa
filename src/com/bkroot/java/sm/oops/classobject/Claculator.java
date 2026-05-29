package com.bkroot.java.sm.oops.classobject;

public class Claculator {

    void add(int a, int b)
    {
        System.out.println(a+b);

    }

    public static void main(String[] args) {
        Claculator c1 = new Claculator();
        c1.add(10,20);
//        System.out.println("additon is " +c1.add(20,30));
    }
}
