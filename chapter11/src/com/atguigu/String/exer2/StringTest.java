package com.atguigu.String.exer2;


import org.junit.Test;

public class StringTest {

    /**
     * ��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת
     * ����"abcdefg"��תΪ"abfedcg"
     */
    @Test
    public void test(){
//        String s = "abcdefg";
//        String s1 = revers(s,2,5);
//        System.out.println(s1); //abfedcg
        String s = "ababcabcabcabcabcabcabc";
        String ss = "ab";
        int c = Stringcount(s, ss);
        System.out.println(c);





    }

    public String revers(String str,int start,int end){
        char [] arr = str.toCharArray();
            // s = ['a','b','f','e','d','c','g']
        for (int i = start,j = end;i <= end;i++,j--){//i = 2 j = 5, 5 <= 5
            char tmp = arr[i]; //c
            arr[i] = arr[j]; //f
            arr[j] = tmp;
        }
        return new String(arr);

    }

//    public int Stringcount(String str,String strcount){
//        int count = 0;
//        if (str.length() >= strcount.length()){
//            int index = str.indexOf(strcount);//���ش��ڵ�λ��
//            while (index >= 0){ //С��0˵�������ڣ�
//                count ++; //����+1
//                index = str.indexOf(strcount,index+strcount.length()); //�ӵڲ�ѯ����λ�ü������ң�2ָ����+2
//            }
//        }else {
//            return count;
//        }
//        return count;
//    }

    public int Stringcount(String str,String strc){
        int count = 0;
        int index = str.indexOf(strc);
        if(str.length() >= strc.length()){
            while (index >= 0){
                count ++ ;
                index = str.indexOf(strc,index + strc.length());
            }
        }
        return count;
    }

}
