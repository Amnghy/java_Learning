package com.atguigu03.reflectapply.apply3;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {

    /*
    反射的应用3-1 调用指定属性
     */
    @Test
    public void test1() throws Exception{
//        Class classzz = Person.class;
//
//        Person o = (Person) classzz.newInstance();
//
//        Field age = classzz.getField("age");
//
//        System.out.println(age.get(o));
        Class classzz = Person.class;

        Object o = classzz.newInstance();

        Field age = classzz.getField("age");

        age.set(o,18);

        System.out.println(age.get(o));

    }

    @Test
    public void test2() throws Exception {
        //private String name

        Class classzz = Person.class;

        Person o = (Person) classzz.newInstance();

        Field age = classzz.getDeclaredField("name");

        age.setAccessible(true);

        age.set(o,"测试字符串");
        System.out.println(age.get(o));
    }

    @Test
    public void test3() throws Exception {
        Class classz = Person.class;

        Person cl = (Person) classz.newInstance();

        Field info = classz.getDeclaredField("info");

        info.setAccessible(true);

        info.set(null,"这是info测试");

        System.out.println(info.get(null));

    }

    @Test
    public void test4() throws Exception{
        //调用指定方法
        Class classzz = Person.class;

        Person o = (Person)classzz.newInstance();

        Method showNation = classzz.getDeclaredMethod("showNation", String.class, int.class);

        showNation.setAccessible(true);

        String chn = (String) showNation.invoke(o, "CHN", 23);

        System.out.println(chn);

    }
    @Test
    public void test5() throws Exception {
        Class classzz = Person.class;

        Person o = (Person)classzz.newInstance();

        Method showInfo = classzz.getDeclaredMethod("showInfo");

        showInfo.setAccessible(true);

        Object invoke = showInfo.invoke(o);

        System.out.println(invoke);

    }

    @Test
    public void test6() throws Exception{
        Class classzz = Person.class;

        Constructor declaredConstructor = classzz.getDeclaredConstructor(String.class, int.class);

        declaredConstructor.setAccessible(true);

        Person tom = (Person) declaredConstructor.newInstance("TOM", 12);

        System.out.println(tom);


    }


}
