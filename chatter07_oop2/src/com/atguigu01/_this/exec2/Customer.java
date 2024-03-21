package com.atguigu01._this.exec2;

/**
 * 这是客户表
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }
}
