package com.atguigu01._this.exec2;


/*
这是账户表
 */
public class Account {
    private double balance;//余额

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
    //存钱
    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("成功存入"+amt);
        }
    }
    //取钱
    public void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("成功取出"+amt);
        }else {
            System.out.println("取款余额不足，或是取款有误");
        }
    }
}
