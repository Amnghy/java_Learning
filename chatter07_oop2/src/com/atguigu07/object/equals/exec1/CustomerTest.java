package com.atguigu07.object.equals.exec1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("tom",21,new Account(2000));
        Customer c2 = new Customer("tom",21,new Account(2000));

        System.out.println(c1.equals(c2)); //false ---> true

    }
}
