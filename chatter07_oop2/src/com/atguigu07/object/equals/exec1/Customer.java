package com.atguigu07.object.equals.exec1;

import java.util.Objects;

public class Customer {
    private String name;
    private int age;
    Account account;

    public Customer() {
    }
    public Customer(String name,int age,Account account){
        this.name = name;
        this.age = age;
        this.account = account;
    }


    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(account, customer.account);
    }

}
