package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description :
 */
public class EP2520 {
    public int countDigits(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int cur = temp % 10;
            count += (n % cur) == 0 ? 1 : 0;
            temp /= 10;
        }
        return count;
    }
}
