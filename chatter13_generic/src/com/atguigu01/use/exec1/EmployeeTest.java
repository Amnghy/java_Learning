package com.atguigu01.use.exec1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
    @Test
    public void test1(){

        TreeSet<Employee> Set = new TreeSet<>();

        Employee e1 = new Employee("Am", 18, new MyDate(1998, 12, 5));
        Employee e2 = new Employee("Bm", 20, new MyDate(1996, 7, 5));
        Employee e3 = new Employee("Bc", 21, new MyDate(1995, 11, 5));
        Employee e4 = new Employee("Dm", 19, new MyDate(1994, 12, 5));

        Set.add(e1);
        Set.add(e2);
        Set.add(e3);
        Set.add(e4);

        Iterator<Employee> iterator = Set.iterator();
        while (iterator.hasNext()){
            Employee next = iterator.next();
            System.out.println(next);
        }
    }


    //需求2根据出身年月去排序
    @Test
    public void test2(){
        Comparator<Employee> em = new Comparator<Employee>(){
            @Override
            public int compare(Employee o1,Employee o2) {
                int year = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if(year != 0){
                    return year;
                }
                int month = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if(month != 0){
                    return month;
                }
                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        };


        TreeSet<Employee> set = new TreeSet<>(em);

        Employee e1 = new Employee("Am", 18, new MyDate(1998, 12, 5));
        Employee e2 = new Employee("Bm", 20, new MyDate(1996, 7, 5));
        Employee e3 = new Employee("Bc", 21, new MyDate(1995, 11, 5));
        Employee e4 = new Employee("Dm", 19, new MyDate(1994, 12, 5));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);

        Iterator<Employee> iter = set.iterator();

        while (iter.hasNext()){
            Employee s1 = iter.next();
            System.out.println(s1);
        }



    }
}
