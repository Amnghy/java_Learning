package com.atguigu08._static.exec1;

public class AccoutTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1.toString());
        Account acc2 = new Account("955361",2000);
        System.out.println(acc2.toString());
        System.out.println(Account.getInterestRate());
        System.out.println(Account.getMinBlance());

    }
}
