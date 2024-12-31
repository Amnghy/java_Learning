package com.atguigu03.reflectapply.apply2;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class OrderTest {
    @Test
    //��ȡ����ʱ�ĸ���
    public void test1() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }

    //��ȡ����ʱ��ķ��͸���
    @Test
    public void test2() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");
        Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }
    //��ȡ����ʱ��Ľӿ�
    @Test
    public void test3() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");
        Class[] interfaces = aClass.getInterfaces();
        for (Class i:interfaces){
            System.out.println(i);
        }

    }

    //��ȡ����ʱ������İ�
    @Test
    public void test4() throws ClassNotFoundException {
        Class aClass = Class.forName("com.atguigu03.reflectapply.data.Person");

        Package aPackage = aClass.getPackage();

        System.out.println(aPackage);
    }

    //��ȡ����ʱ��ĸ���ķ���
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
