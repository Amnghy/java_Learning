package com.atguigu.String.dataexec2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class exer02 {
    @Test
    public void test2(){
        /*
        ʹ��Calendar  ��ȡ��ǰʱ�䣬�����ʱ������Ϊ������ռ�100��
         */
//        Calendar calendar = Calendar.getInstance();
//        Date date = calendar.getTime();
//        System.out.println("�������Ϊ��" + date);
//
//
//        calendar.add(calendar.DAY_OF_YEAR,100);
//
//
//        Date newdate = calendar.getTime();
//        System.out.println("100��������Ϊ��" + newdate);

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        calendar.add(calendar.DAY_OF_YEAR,100);

        Date date1 = calendar.getTime();

        System.out.println(date1);








    }


    @Test
    public void test3(){
        /*
        ʹ��localDateTime��ȡ��ǰʱ�䣬�����ʱ����Ϊ������ա��ڻ�ȡ��100��������
         */

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("�������Ϊ"+ localDateTime);
//        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
//        System.out.println("100���Ժ������Ϊ��" + localDateTime1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println(localDateTime1);



    }
}
