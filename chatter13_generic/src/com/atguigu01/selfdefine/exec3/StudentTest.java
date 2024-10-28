package com.atguigu01.selfdefine.exec3;

public class StudentTest {
    public static void main(String[] args) {
        Student<String> s1 = new Student<>("TOM","良好");
        Student<Double> s2 = new Student<>("Jerry",87.5); // 87.5自动装箱
        Student<Character> s3 = new Student<>("Rose",'A');//自动装箱

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }
}
