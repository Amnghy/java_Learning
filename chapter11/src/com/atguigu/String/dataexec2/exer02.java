package com.atguigu.String.dataexec2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class exer02 {
    @Test
    public void test2(){
        /*
        使用Calendar  获取当前时间，把这个时间设置为你的生日加100天
         */
//        Calendar calendar = Calendar.getInstance();
//        Date date = calendar.getTime();
//        System.out.println("你的生日为：" + date);
//
//
//        calendar.add(calendar.DAY_OF_YEAR,100);
//
//
//        Date newdate = calendar.getTime();
//        System.out.println("100天后的日期为：" + newdate);

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
        使用localDateTime获取当前时间，把这个时间设为你的生日。在获取你100天后的日期
         */

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("你的生日为"+ localDateTime);
//        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
//        System.out.println("100天以后的日期为：" + localDateTime1);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println(localDateTime1);



    }
}
