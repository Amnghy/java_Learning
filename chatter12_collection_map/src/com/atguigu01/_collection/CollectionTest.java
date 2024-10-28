package com.atguigu01._collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {


    @Test
    public void test(){
        Collection cool = new ArrayList();

        cool.add("AA");
        cool.add("BB");
        cool.add(123); //�Զ�װ��
        cool.add(new Person("¶��",23));


        System.out.println(cool);
        System.out.println(cool.size());


        Collection cool1 = new ArrayList();

        cool1.add("BB");
        cool1.add(128);
        cool1.addAll(cool);

        Person p1 = new Person("tom",32);
        cool.add(p1);

        System.out.println(cool1);
        System.out.println(cool1.size());


        System.out.println(cool1.isEmpty()); //�Ƿ�Ϊ��

        System.out.println(cool1.contains("AA")); // �Ƿ����AA
        System.out.println(cool1.contains(128)); // �Ƿ����128

        System.out.println(cool.contains(new Person("tom",32)));




    }
}
