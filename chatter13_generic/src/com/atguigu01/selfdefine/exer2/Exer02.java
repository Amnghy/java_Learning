package com.atguigu01.selfdefine.exer2;

import org.junit.Test;

import java.util.Arrays;

public class Exer02 {
    //��дһ�����ͷ�����ʵ������������������ָ��Ԫ�ؽ���
    public static <E> void method1(E[] e,int a,int b ){
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }

    @Test
    public void test1(){
        String[]  arr = new String[]{"aa","bb","cc"};
        method1(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }


    //��дһ�����ͷ�������һ���������õ��������飬����ת�����е�����Ԫ��


}
