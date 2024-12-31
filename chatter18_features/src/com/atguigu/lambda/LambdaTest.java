package com.atguigu.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {
    @Test
    public void test(){
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        con1.accept("你好，北京");

        Consumer<String> con2 = s -> System.out.println(s);

        con2.accept("你好,厦门");
    }

    @Test
    public void test2(){
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(c1.compare(12, 11));


        Comparator<Integer> c2 = (o1, o2) -> {
            return o1.compareTo(o2);
        };

        System.out.println(c2.compare(12, 23));


    }
}
