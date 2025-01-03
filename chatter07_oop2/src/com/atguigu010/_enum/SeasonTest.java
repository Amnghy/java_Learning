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


    public static final Season SPRING = new Season("����","��ů����");
    public static final Season SUMMER = new Season("����","��������");
    public static final Season AUTUMN = new Season("����","��ȥ����");
    public static final Season WINTER = new Season("����","��ѩ����");

    @Override
    public String toString() {
        return "Season{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }
}
