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
        System.out.println("����޸�"+boy.getName());
        boy.marry(this);
    }

    /**
     * �Ƚ�����girl�Ĵ�С
     *
     * @param girl
     * @return ������ǰ����󣬸�������ǰ����С 0��ʾ���
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
