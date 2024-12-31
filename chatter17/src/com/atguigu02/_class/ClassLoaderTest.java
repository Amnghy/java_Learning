package com.atguigu02._class;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderTest {

    /*
    通过properties 加载指定配置文件
     */
    @Test
    public void test1() throws IOException {
        Properties pro = new Properties();
        FileInputStream is = new FileInputStream(new File("info.properties"));

        pro.load(is);

        String name = pro.getProperty("name");
        String age = pro.getProperty("age");


        System.out.println(name + ":" + age);
    }


    /*
       通过Classloader加载指定配置文件
     */

    @Test
    public void test2() throws IOException {
        Properties pros = new Properties();

        InputStream s1 = ClassLoader.getSystemClassLoader().getResourceAsStream("info1.properties");


        pros.load(s1);

        String p1 = pros.getProperty("name");
        String p2 = pros.getProperty("age");

        System.out.println(p1 + ":" + p2);

    }
}
