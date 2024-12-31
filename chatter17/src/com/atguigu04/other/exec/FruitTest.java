package com.atguigu04.other.exec;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class FruitTest {
    @Test
    public void test1() throws Exception {
        //1.��ȡ�����ļ��е���Ϣ
        Properties Pros1 = new Properties();

        File f1 = new File("src/config.properties");

        FileInputStream fls = new FileInputStream(f1);

        Pros1.load(fls);

        String fruitname = (String) Pros1.get("fruitname");


        //2.ͨ�����䴴��ָ��ȫ������Ӧ��ʵ��
        Class aClass = Class.forName(fruitname);
        Constructor declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        Fruit fruit = (Fruit) declaredConstructor.newInstance();


        //ͨ��ե֭���������run����
        Juicer juicer = new Juicer();
        juicer.run(fruit);

    }

}
