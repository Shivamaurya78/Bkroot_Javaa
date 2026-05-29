package com.bkroot.java.sm.oops.classobject;

public class Account {
    String name;
    int balance;
//    System.out.println("Availabe balance :" +balance);

    void deposit (int amount)
    {
        balance = balance + amount;
//        System.out.println("Availabe balance :" +balance);
        System.out.println("Money is Deposit: " +amount+ " Total balance " +balance);
    }

    public static void main(String[] args) {

        Account ac1 = new Account();

        ac1.name = "Shiva";
        ac1.balance = 1000;

        ac1.deposit(500);
    }
}
