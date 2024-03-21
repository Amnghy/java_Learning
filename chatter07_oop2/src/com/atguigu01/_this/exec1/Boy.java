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
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if(this.Age >= 22){
            System.out.println("我终于可以结婚了");
        }else{
            System.out.println("我只能多谈恋爱了");
        }
    }

}
