package com.atguigu03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请录入学生的信息");


        List list = new ArrayList();



        while (true){
            System.out.println("1:继续录入，0:结束录入");
            int selection = s1.nextInt();
            if(selection == 0){
                break;
            }

            System.out.println("请输入学生姓名");
            String name = s1.next();
            System.out.println("请输入学生年龄");
            int age = s1.nextInt();

            Student s = new Student(name,age);
            list.add(s);

        }

        System.out.println("遍历学生信息:");
        for(Object o: list){
            System.out.println(o.toString());

    }
}
}
