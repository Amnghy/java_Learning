package com.atguigu11.Test;

import com.atguigu07._abstract.exec2.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Function;

public class LambdaTest {
    @Test
    public void test(){
        Comparator<Integer> c1 = (o1,o2) -> {
          return o1.compareTo(o2);
        };

        System.out.println(c1.compare(11, 22));

        Comparator<Integer> c2 = (o1,o2) -> o1.compareTo(o2);

        System.out.println(c2.compare(33, 44));


    }
    @Test
    public void test2(){
        Function<Integer, Employee> function1 = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer integer) {
                return
            }
        }



    }

}
