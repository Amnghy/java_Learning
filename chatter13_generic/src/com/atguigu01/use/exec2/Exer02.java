package com.atguigu01.use.exec2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Exer02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * (99 - 0 + 1));
            arrayList.add(random);
        }
        for (Integer s1:arrayList){
            System.out.println(s1);
        }

        arrayList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        System.out.println();
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }


    }
}
