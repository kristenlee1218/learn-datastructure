package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :
 */
public class EP762 {
    public int countPrimeSetBits(int l, int r) {
        int result = 0;
        for (int x = l; x <= r; ++x) {
            if (isSmallPrime(Integer.bitCount(x))) {
                result++;
            }
        }
        return result;
    }
    public boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19);
    }
}
