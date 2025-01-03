package com.atguigu010._enum;

public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}

class Season{
    private final String SeasonName;
    private final String SeasonDesc;

    Season(String SeasonName,String SeasonDesc){
        this.SeasonName = SeasonName;
        this.SeasonDesc = SeasonDesc;
    }

    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }


    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋去冬来");
    public static final Season WINTER = new Season("冬天","白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
