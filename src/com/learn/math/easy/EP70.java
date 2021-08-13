package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/13
 * @description :正在爬楼梯。需要 n 阶才能到达楼顶。每次可以爬 1 或 2 个台阶。
 * 有多少种不同的方法可以爬到楼顶呢？
 */
public class EP70 {
    public int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
