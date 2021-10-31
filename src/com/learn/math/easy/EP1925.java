package com.learn.math.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个平方和三元组 (a,b,c) 指的是满足 a^2 + b^2 = c^2
 * 的整数三元组 a，b 和 c。一个整数 n，请返回满足 1 <= a, b, c <= n
 * 的平方和三元组的数目
 */
public class EP1925 {
    public int countTriples(int n) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set.add(i * i);
        }
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                if (set.contains(a * a + b * b)) {
                    count++;
                }
            }
        }
        return count;
    }
}
