package com.atguigu08._interface.exer1;

public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eat = new Eatable[3];
        eat[0] = new Chinese();
        eat[1] = new American();
        eat[2] = new Indian();

        for (int i=0;i< eat.length;i++){
            eat[i].eat();
        }



    }
}
