package com.learn.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public static void main(String[] args) {
        String s = String.valueOf(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        String res = simpleDateFormat.format(date);
        String[] strs = res.split(" ");
        String day = strs[0];
        String time = strs[1];
        System.out.println(day);
        System.out.println(time);
    }
}