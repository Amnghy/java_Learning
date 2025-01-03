package com.atguigu010._enum;

public class SeasonTest1 {
    public static void main(String[] args) {
        //toString
        System.out.println(Season1.AUTUMN);
        //name
        System.out.println(Season1.AUTUMN.name());

        Season1[] s1 = Season1.values();
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
        //返回当前枚举类中名称为objName的枚举类对象
        //如果枚举类中不存在objName的名称对象，则报错。
        String objName = "白雪皑皑";
        Season1 season1 =  Season1.valueOf(objName);
        System.out.println(season1);


    }
}
enum Season1{

    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋去冬来"),
    WINTER("冬天","白雪皑皑");


    private final String SeasonName;
    private final String SeasonDesc;

    Season1(String SeasonName,String SeasonDesc){
        this.SeasonName = SeasonName;
        this.SeasonDesc = SeasonDesc;
    }

    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
