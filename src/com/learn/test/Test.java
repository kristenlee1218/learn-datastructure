package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test {
    public int binaryGap(int n) {
        int max = 0, count = 0;
        while (n >= 1) {
            if (n % 2 == 0 && count > 0) {
                count++;
            } else if (n % 2 == 1) {
                max = Math.max(max, count);
                count = 1;
            }
            n /= 2;
        }
        return max;
    }

}
