package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/12/31
 * @description : 一个整数 n，反转 n 得到 reversed1，接着反转 reversed1
 * 得到 reversed2。如果 reversed2 等于 n，返回 true；否则返回 false
 */
public class EP2119 {
    public boolean isSameAfterReversals(int n) {
        if (n == 0) {
            return true;
        }
        return n % 10 != 0;
    }
}
