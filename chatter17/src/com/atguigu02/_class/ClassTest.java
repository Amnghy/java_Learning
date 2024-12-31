package com.atguigu02._class;

import org.junit.Test;

public class ClassTest {
    @Test
    public void test1() throws ClassNotFoundException {


        Class clss1 = User.class;

        User u1 = new User();
        Class clss2 = u1.getClass();



        String classname = "com.atguigu02._class.User";
        Class clss3 = Class.forName(classname);


        System.out.println(clss1 == clss3);


    }
}
