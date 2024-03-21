package com.ostb08.constructor.exec3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer cus = new Customer("jane","simr");
        Account account = new Account(1000,2000,0.018);

        cus.setAccount(account);
//
        cus.getAccount().deposit(100);
        cus.getAccount().withdraw(960);
        cus.getAccount().withdraw(2000);
        System.out.println(cus.getAccount().getBalance());


    }
}
