package com.atguigu03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("��¼��ѧ������Ϣ");


        List list = new ArrayList();



        while (true){
            System.out.println("1:����¼�룬0:����¼��");
            int selection = s1.nextInt();
            if(selection == 0){
                break;
            }

            System.out.println("������ѧ������");
            String name = s1.next();
            System.out.println("������ѧ������");
            int age = s1.nextInt();

            Student s = new Student(name,age);
            list.add(s);

        }

        System.out.println("����ѧ����Ϣ:");
        for(Object o: list){
            System.out.println(o.toString());

    }
}
}
