package com.learn.math.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个平方和三元组 (a,b,c) 指的是满足 a^2 + b^2 = c^2 的 整数 三元组 a，b 和 c。
 * 一个整数 n，请返回满足 1 <= a, b, c <= n 的平方和三元组的数目
 */
public class EP1925 {
    public int countTriples(int n) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i * i, 1);
        }
        for (Integer a : map.keySet()) {
            for (Integer b : map.keySet()) {
                count += map.getOrDefault(a + b, 0);
            }
        }
        return count;
    }
}
