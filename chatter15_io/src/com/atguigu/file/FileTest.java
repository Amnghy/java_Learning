package com.atguigu.file;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {

    /*
    判断指定目录底下是否有后缀未.jpg的文件，有，则输出。
     */
    @Test
    public void test1(){
        File file = new File("C:\\Users\\Amnghy\\Documents\\WeChat Files\\wxid_tx7pgsqmz8x121\\FileStorage\\Video\\2024-10");

        //方法1
//        String[] list = file.list();
//        for(String i :list){
//            if(i.endsWith(".jpg")){
//                System.out.println(i);
//            }
//        }

        //方法2
//        File[] files = file.listFiles();
//        for(File i:files){
//            if(i.getName().endsWith(".jpg")){
//                System.out.println(i.getAbsolutePath());
//            }
//        }
        //方法3
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return name.endsWith(".jpg");
            }
        });


        for(String i:list){
            System.out.println(i);
        }


    }
}
