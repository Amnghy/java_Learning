package com.atguigu08._interface.exer2;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle C1 = new ComparableCircle(2.3);
        ComparableCircle C2 = new ComparableCircle(5.3);
        int comvalue = C1.compareTo(C2);
        if (comvalue > 0){
            System.out.println("c1�����");
        } else if (comvalue < 0) {
            System.out.println("c2�����");
        }else {
            System.out.println("һ����");
        }
    }
}
