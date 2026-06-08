package com.bkroot.java.sm.Basic.Strings;

public class StringBufferConcept {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Shiva");
        stringBuffer.append("Maurya"); // StringBuffer bhi mutable class hai.
        // Working almost same hai.
        // StringBuffer ke methods synchronized hote hain.
        // Matlab ek time par ek hi thread access karega.
        System.out.println("StringBuffer code "+stringBuffer);
    }
}
