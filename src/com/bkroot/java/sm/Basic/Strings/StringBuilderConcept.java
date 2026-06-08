package com.bkroot.java.sm.Basic.Strings;

public class StringBuilderConcept {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Shiva");
        stringBuilder.append(" Maurya");   // same object
                                          // Before  : Shiva
                                          // After : Shiva Maurya
                                          // No new object create
        System.out.println(stringBuilder);
    }
}
