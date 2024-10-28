package com.atguigu05.map.exer2;

import com.atguigu01._collection.Person;
import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class MapTest {

    @Test
    public void test1() {
        HashMap map = new HashMap();

        map.put("AA", 56);
        map.put(67, "Tom");
        map.put("BB", 80);
        map.put(new Person("Am", 12), 53);


//        Object value = map.get("AA");
//        System.out.println(value);


        //遍历Key集

//        Set keySet = map.keySet();
//        Iterator iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            Object key = iterator.next();
//            System.out.println(key);
//
//        }
        //方式1
        //遍历value集
//        Collection values = map.values();
//
//        for(Object obj:values){
//            System.out.println(obj);
//        }

        //方式2
//        Set keySet = map.keySet();
//        for (Object key:keySet){
//            Object value = map.get(key);
//            System.out.println(value);
//        }
    }

    @Test
    public void test2() {
        HashMap map = new HashMap();

        map.put("AA", 56);
        map.put(67, "Tom");
        map.put("BB", 80);
        map.put(new Person("Am", 12), 53);

        //方式1：
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()){
//            Map.Entry entry = (Map.Entry) iterator.next();
//            System.out.println(entry.getKey() + "--->" + entry.getValue());
            System.out.println(iterator.next());

        }
        //方式2:
        Set keySet = map.keySet();
        for(Object key:keySet){
            System.out.println(key + "-->" + map.get(key));
        }


    }
}