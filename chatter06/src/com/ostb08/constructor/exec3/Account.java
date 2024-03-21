package com.ostb08.constructor.exec3;

public class Account {
    private int id;
    private double balance;
    private double annualinterestRate;


    public Account(int i,double b,double c){
        id = i;
        balance = b; //余额
        annualinterestRate = c; //年利率
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualinterestRate(){
        return annualinterestRate;
    }

    public void setId(int a){
        id = a;
    }

    public void setBalance(int b){
        balance = b;
    }

    public void setAnnualinterestRate(int c){
        annualinterestRate = c;
    }

    public void withdraw(double amount){ //取钱
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("成功取出"+ amount + "元");
        }else {
            System.out.println("余额不足，取款失败。");
        }
    }

    public void deposit(double amount){ //存钱
        balance += amount;
        System.out.println("存钱成功，存了" + amount + "元");
    }

}
