package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个整数，编写一个函数来判断它是否是 3 的幂次方
 */
public class EP326 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n % 3 == 0) {
            n /= 3;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }
}
