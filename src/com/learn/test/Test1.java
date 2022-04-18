package com.learn.test;

import org.omg.CORBA.MARSHAL;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public boolean isArmstrong(int n) {
        int count = n, sum = 0;
        int k = String.valueOf(n).length();
        for (int i = 0; i < k; i++) {
            sum += Math.pow(count % 10, k);
            count /= 10;
        }
        return sum == n;
    }
}