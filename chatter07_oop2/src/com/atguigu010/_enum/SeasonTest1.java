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
        //���ص�ǰö����������ΪobjName��ö�������
        //���ö�����в�����objName�����ƶ����򱨴�
        String objName = "��ѩ����";
        Season1 season1 =  Season1.valueOf(objName);
        System.out.println(season1);


    }
}
enum Season1{

    SPRING("����","��ů����"),
    SUMMER("����","��������"),
    AUTUMN("����","��ȥ����"),
    WINTER("����","��ѩ����");


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
