package com.atguigu04.comparable;

import com.atguigu04.Product;
import org.junit.Test;

import java.util.Arrays;


public class ComparableTest {

    @Test
    public void test1(){


        String[] arr = new String[]{"Amnghy","Tony","Jey","Luxi"};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test
    public void test2(){
//        Product[] prd = new Product[]{new Product("华为",89999),new Product("中心",79999),new Product("小米",99999)};
        Product[] prd = new Product[4];
        prd[0] = new Product("HUAWEIMATE30",3999);
        prd[1] = new Product("XIAOMI 12",2999);
        prd[2] = new Product("VIVO X9",6999);
        prd[3] = new Product("HONOR MAGIC4",5999);

        Arrays.sort(prd);


        for (int i = 0; i < prd.length; i++) {
            System.out.println(prd[i]);
        }





    }



}
