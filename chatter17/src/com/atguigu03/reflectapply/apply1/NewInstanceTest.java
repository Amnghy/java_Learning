package com.atguigu03.reflectapply.apply1;

import com.atguigu03.reflectapply.data.Person;
import org.junit.Test;

public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class pers = Person.class;


        Person s1 = (Person) pers.newInstance();

        System.out.println(s1);


    }
}
