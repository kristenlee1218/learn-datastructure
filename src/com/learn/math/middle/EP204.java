package com.learn.math.middle;

/**
 * @author : Kristen
 * @date : 2021/8/4
 * @description : 统计所有小于非负整数 n 的质数的数量
 */
public class EP204 {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] flag = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!flag[i]) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    flag[j] = true;
                }
            }
        }
        return count;
    }
}
