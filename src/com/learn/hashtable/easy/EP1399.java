package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 一个整数 n、请先求出从 1 到 n 的每个整数 10 进制表
 * 示下的数位和（每一位上的数字相加），然后把数位和相等的数字放到同一个
 * 组中。请统计每个组中的数字数目，并返回数字数目并列最多的组有多少个
 */
public class EP1399 {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int maxValue = 0;
        for (int i = 1; i <= n; i++) {
            int key = 0, j = i;
            while (j != 0) {
                key += j % 10;
                j /= 10;
            }
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
            maxValue = Math.max(maxValue, hashMap.get(key));
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> kvPair : hashMap.entrySet()) {
            if (kvPair.getValue() == maxValue) {
                count++;
            }
        }
        return count;
    }
}
