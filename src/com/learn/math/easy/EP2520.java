package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description :
 */
public class EP2520 {
    public int countDigits(int num) {
        int count = 0;
        int tmp = num;
        while (tmp > 0) {
            int cur = tmp % 10;
            count += (num % cur) == 0 ? 1 : 0;
            tmp /= 10;
        }
        return count;
    }
}
