package com.atguigu05._exer.exer1;

public class Exer03Test {
    public static void main(String[] args) {
        try {
        Person p1 = new Person("Tom",10);
        System.out.println(p1);
        Person p2 = new Person("mm",-2);
        System.out.println(p2);
        }catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }

    }
}
