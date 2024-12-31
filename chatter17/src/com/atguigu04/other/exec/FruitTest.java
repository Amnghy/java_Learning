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
        //1.读取配置文件中的信息
        Properties Pros1 = new Properties();

        File f1 = new File("src/config.properties");

        FileInputStream fls = new FileInputStream(f1);

        Pros1.load(fls);

        String fruitname = (String) Pros1.get("fruitname");


        //2.通过反射创建指定全类名对应的实例
        Class aClass = Class.forName(fruitname);
        Constructor declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        Fruit fruit = (Fruit) declaredConstructor.newInstance();


        //通过榨汁机对象调用run方法
        Juicer juicer = new Juicer();
        juicer.run(fruit);

    }

}
