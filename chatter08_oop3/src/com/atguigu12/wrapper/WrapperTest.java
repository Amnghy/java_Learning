package com.atguigu12.wrapper;

import org.junit.Test;

public class WrapperTest {


    @Test
    public void test1(){
        int i1 = 10;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1.toString());

        float f1 = 12.3f;
        f1 = 32.f;
        Float ff1 = new Float(f1);
        System.out.println(ff1.toString());


        String s1 = "12313";
        String ss1 = new String(s1);
        System.out.println(ss1.toString());




    }
}
