package com.atguigu07._abstract.exec2;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);

        Employee[] emps = new Employee[2];
        emps[0] = new SalariedEmployee("涨销量",1002,new MyDate(1992,5,18),18000);
        emps[1] = new HourlyEmployee("和尚",1003,new MyDate(1998,3,12),240,100);

        System.out.println("情输入当前的月份:");
        int month = sacn.nextInt();
        for (int i=0;i < emps.length;i++){
            System.out.println(emps[i].toString());
            System.out.println("工资为："+emps[i].earnings());
            if(month == emps[i].getBirthday().getMonth()){
                System.out.println("生日快乐，加薪100");
            }
        }


    }




}
