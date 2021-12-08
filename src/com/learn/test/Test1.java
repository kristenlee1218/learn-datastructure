package com.learn.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        while (n != 1) {
            int count = 0;
            while (n > 0) {
                count += (n % 10) * (n % 10);
                n /= 10;
            }
            if (map.containsKey(count)) {
                return false;
            }
            map.put(count, 1);
            n = count;
        }
        return true;
    }
}