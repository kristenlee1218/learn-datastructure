package com.learn.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            while (temp > 0) {
                if (temp % 10 == 0 || i % (temp % 10) != 0) {
                    break;
                }
                temp /= 10;

            }
            if (temp == 0) {
                list.add(i);
            }
        }
        return list;
    }
}