package com.atguigu11._annotation.juint;

import org.junit.Test;

public class JuintTest {

    int number = 10;

    @Test
    public void test1(){
        System.out.println("输出正常值");
    }

    @Test
    public void test2(){
        System.out.println("输出正常值2");
        System.out.println("numbet = " + number);
        method();
    }

    public void method(){
        System.out.println("method....");
    }


}
