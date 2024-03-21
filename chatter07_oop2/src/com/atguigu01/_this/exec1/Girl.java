package com.atguigu01._this.exec1;

public class Girl {
    private String name;
    private int Age;

    public Girl(){

    }
    public Girl(String name, int age) {
        this.name = name;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){
        System.out.println("我想嫁给"+boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个girl的大小
     *
     * @param girl
     * @return 正数当前对象大，负数：当前对象小 0表示相等
     */
    public int compare(Girl girl){
        if(this.Age > girl.Age){
            return 1;
        } else if (this.Age < girl.Age) {
            return -1;
        }else {
            return 0;
        }
    }
}
