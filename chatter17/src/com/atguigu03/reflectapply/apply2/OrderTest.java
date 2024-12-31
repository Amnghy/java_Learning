package com.atguigu03.reflectapply.apply2;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OrderTest {
    @Test
    //获取运行时的父类
    public void test1() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }

    //获取运行时类的泛型父类
    @Test
    public void test2() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");
        Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }
    //获取运行时类的接口
    @Test
    public void test3() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class[] interfaces = aClass.getInterfaces();
        for (Class i:interfaces){
            System.out.println(i);
        }

    }

    //获取运行时所在类的包
    @Test
    public void test4() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");

        Package aPackage = aClass.getPackage();

        System.out.println(aPackage);
    }

    //获取运行时类的父类的泛型
    @Test
    public void test5() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");

        Type genericSuperclass = aClass.getGenericSuperclass();

        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;

        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

        System.out.println(((Class)actualTypeArguments[0]).getName());

       // System.out.println(genericSuperclass);



    }
}
