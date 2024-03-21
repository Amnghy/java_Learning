package com.atguigu01._this.exec2;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("三","张");
        bank.addCustomer("四","李");

        System.out.println("银行里面有" + bank.getNumOfCustomers()+"个客户");
        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);
        bank.getCustomer(0).getAccount().deposit(100);
        System.out.println("还剩下" + bank.getCustomer(0).getAccount().getBalance()+"元");

//        System.out.println("账户余额为"+bank.getCustomer(1).getAccount().getBalance());


    }
}
