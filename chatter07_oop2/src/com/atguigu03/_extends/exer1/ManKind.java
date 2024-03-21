package com.atguigu03._extends.exer1;

public class ManKind {
    private int sex;
    private int salay;

    public ManKind() {
    }

    public ManKind(int sex, int salay) {
        this.sex = sex;
        this.salay = salay;
    }



    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalay() {
        return salay;
    }

    public void setSalay(int salay) {
        this.salay = salay;
    }


    public void manorwoman(){
        if (this.sex == 1){
            System.out.printf("Man");
        } else if (this.sex == 0) {
            System.out.printf("WoMan");
        }
    }
    public void emplyeed(){
        if (this.salay == 0){
            System.out.printf("No job");
        } else if (this.salay == 1) {
            System.out.printf("job");
        }

    }


}
