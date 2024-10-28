package com.ostb._this;

import org.junit.Test;

public class Test1 {

    @Test
    public void test1(){
        try {
        String s1 = "123";
        s1 = "abc";
        int i = Integer.parseInt(s1);
        System.out.println(i);
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(10 / 0 );
        }finally {
            System.out.println("³ÌÐò½áÊø");
        }

    }
}
