package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description : 编写一个算法来判断一个数 n 是不是快乐数
 */
public class EP202 {
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
