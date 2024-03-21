package com.atguigu01._this.exec1;

public class Boy_GirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("杰克",24);
        Girl girl1 = new Girl("露西",21);

        girl1.marry(boy1);
        boy1.shout();

        Girl girl2 = new Girl("朱丽叶",18);
        int com = girl1.compare(girl2);
        if(com > 0){
            System.out.println(girl1.getName()+"大一些");
        } else if (com < 0) {
            System.out.println(girl2.getName()+"大一些");
        }else {
            System.out.println("他们一样的年龄");
        }

    }
}
