package com.atguigu.file;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest {

    /*
    �ж�ָ��Ŀ¼�����Ƿ��к�׺δ.jpg���ļ����У��������
     */
    @Test
    public void test1(){
        File file = new File("C:\\Users\\Amnghy\\Documents\\WeChat Files\\wxid_tx7pgsqmz8x121\\FileStorage\\Video\\2024-10");

        //����1
//        String[] list = file.list();
//        for(String i :list){
//            if(i.endsWith(".jpg")){
//                System.out.println(i);
//            }
//        }

        //����2
//        File[] files = file.listFiles();
//        for(File i:files){
//            if(i.getName().endsWith(".jpg")){
//                System.out.println(i.getAbsolutePath());
//            }
//        }
        //����3
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
