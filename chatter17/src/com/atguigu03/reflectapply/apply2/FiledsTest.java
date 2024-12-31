package com.atguigu03.reflectapply.apply2;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;

public class FiledsTest {
    @Test
    public void test1(){
        Class<Person> personClass = Person.class;

        Field[] s1 = personClass.getFields();

        for (Field f : s1){
            System.out.println(f);
        }


    }
}
