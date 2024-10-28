package com.atguigu06.team.domain;



public class Printer implements Equipment{
    private String name;//打印机名称
    private String type;//机器的类型

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "（" + type + "）";
    }
}
