package com.atguigu05._exer.exer1;

public class Person {
    private String name;
    private int lifevalue;

    public Person() {
    }

    public Person(String name, int lifevalue) {
        this.name = name;
        setLifevalue(lifevalue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifevalue() {
        return lifevalue;
    }

    public void setLifevalue(int lifevalue) {
        if(lifevalue < 0){
            throw new NoLifeValueException("生命值不能为负数:"+lifevalue);
        }
        this.lifevalue = lifevalue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifevalue=" + lifevalue +
                '}';
    }
}
