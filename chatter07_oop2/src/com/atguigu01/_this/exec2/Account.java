package com.atguigu01._this.exec2;


/*
�����˻���
 */
public class Account {
    private double balance;//���

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }
    //��Ǯ
    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("�ɹ�����"+amt);
        }
    }
    //ȡǮ
    public void withdraw(double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("�ɹ�ȡ��"+amt);
        }else {
            System.out.println("ȡ�����㣬����ȡ������");
        }
    }
}
