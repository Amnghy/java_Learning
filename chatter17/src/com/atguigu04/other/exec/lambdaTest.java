package com.atguigu04.other.exec;

import org.junit.Test;

import java.util.Comparator;

public class lambdaTest {
    @Test
    public void test1(){
        Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("²âÊÔ");
            }
        };
        runnable.run();

        Runnable r2 = () -> {
            System.out.println("wadfmz");

        };
        r2.run();
    }
}
