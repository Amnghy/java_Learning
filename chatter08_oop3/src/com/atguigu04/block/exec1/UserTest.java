package com.atguigu04.block.exec1;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getinfo());

        User u2 = new User("Tom","123456888");
        System.out.println(u2.getinfo());
    }
}
