package com.learn.test;
/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public int countPrimeSetBits(int l, int r) {
        int result = 0;
        for (int i = l; i <= r; i++) {
            if (isSmallPrime(Integer.bitCount(i))) {
                result++;
            }
        }
        return result;
    }

    public boolean isSmallPrime(int i) {
        return (i == 2 || i == 3 || i == 5 || i == 7 || i == 11 || i == 13 || i == 17 || i == 19);
    }
}