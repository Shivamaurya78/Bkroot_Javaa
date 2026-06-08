package com.bkroot.java.sm.Basic.variable;

public class Instancee {
    // Class ke andar but Method ke bahar ..
    String name;      // Instance Variable
    int height;       // Instance Variable

    void display()
    {
        System.out.println(name+ " height is  " +height +" feet");
    }

    public static void main(String[] args) {
        Instancee s1 = new Instancee();    // object ke throw access hote he
        s1.name = "Shiva";
        s1.height = 6;
        s1.display();

    }
}
