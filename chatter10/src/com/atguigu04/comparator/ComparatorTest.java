package com.atguigu04.comparator;

import com.atguigu04.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    @Test
    public void test1(){
        Product[] prd = new Product[4];
        prd[0] = new Product("HUAWEIMATE30",3999);
        prd[1] = new Product("XIAOMI 12",2999);
        prd[2] = new Product("VIVO X9",6999);
        prd[3] = new Product("HONOR MAGIC4",5999);

        //创建一个实现Comparator接口的实现类的对象
        //按照价格从低到高
        Comparator comparator = new Comparator() {
            @Override
            //如何判断两个对象的大小其标准就是此方法的方法体编写的逻辑
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return -Double.compare(p1.getPrice(),p2.getPrice());

                }
                throw new RuntimeException("类型不匹配");
            }
        };

        Arrays.sort(prd,comparator);


        for (int i = 0; i < prd.length; i++) {
            System.out.println(prd[i]);
        }

    }
}
