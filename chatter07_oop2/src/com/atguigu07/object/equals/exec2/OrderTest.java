package com.atguigu07.object.equals.exec2;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(100,"张三");
        Order order2 = new Order(100,"张三");

        System.out.println(order1.equals(order2));


        Order order3 = new Order(100,new String("张三"));
        Order order4 = new Order(100,new String("张三"));

        System.out.println(order3.equals(order4));
    }
}
