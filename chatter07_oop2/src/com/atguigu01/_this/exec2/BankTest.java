package com.atguigu01._this.exec2;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("��","��");
        bank.addCustomer("��","��");

        System.out.println("����������" + bank.getNumOfCustomers()+"���ͻ�");
        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);
        bank.getCustomer(0).getAccount().deposit(100);
        System.out.println("��ʣ��" + bank.getCustomer(0).getAccount().getBalance()+"Ԫ");

//        System.out.println("�˻����Ϊ"+bank.getCustomer(1).getAccount().getBalance());


    }
}
