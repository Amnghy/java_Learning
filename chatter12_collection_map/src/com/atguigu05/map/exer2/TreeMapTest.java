package com.atguigu05.map.exer2;

import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void test1(){
        TreeMap map = new TreeMap();

        map.put("AA",12);
        map.put("BB",23);
        map.put("CC",33);
        map.put("DD",42);
        map.put("EE",11);
        map.put("FF",98);

        Set entrySet = map.entrySet();

        for(Object obj:entrySet){
            System.out.println(obj);
        }
    }
    @Test
    public void test2() {
        TreeMap map = new TreeMap();

        map.put(new User("AA3",15), 12);
        map.put(new User("BB",17), 13);
        map.put(new User("AA1",18), 17);
        map.put(new User("AA2",16), 15);

        Set entrySet = map.entrySet();

        for (Object obj : entrySet) {
            System.out.println(obj);
        }
    }
}

