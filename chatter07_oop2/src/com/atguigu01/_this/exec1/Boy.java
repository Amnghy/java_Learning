package com.atguigu01._this.exec1;

public class Boy {
    private String name;
    private int Age;

    public Boy(){
    }

    public Boy(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void marry(Girl girl){
        System.out.println("����Ȣ"+girl.getName());
    }

    public void shout(){
        if(this.Age >= 22){
            System.out.println("�����ڿ��Խ����");
        }else{
            System.out.println("��ֻ�ܶ�̸������");
        }
    }

}
