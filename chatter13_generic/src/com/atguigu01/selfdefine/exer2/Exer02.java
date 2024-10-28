package com.atguigu01.selfdefine.exer2;

import org.junit.Test;

import java.util.Arrays;

public class Exer02 {
    //编写一个泛型方法，实现任意引用类型数组指定元素交换
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


    //编写一个泛型方法接受一个任意引用的类型数组，并反转数组中的所有元素


}
