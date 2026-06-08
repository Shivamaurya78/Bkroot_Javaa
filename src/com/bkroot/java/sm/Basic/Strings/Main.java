package com.bkroot.java.sm.Basic.Strings;

public class Main {
    public static void main(String[] args) {
//        // String
        String str = "Hello";


//        str = "Shiva";
        str =str.concat(" Shiva");
        System.out.println("String is "+str);

        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Shiva");
        stringBuilder.append(" Maurya");
        System.out.println("StringBuilder is " + stringBuilder);

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Shiva");
        stringBuffer.append(" Maurya");
        System.out.println("StringBuffer is " +stringBuffer);
    }
}
