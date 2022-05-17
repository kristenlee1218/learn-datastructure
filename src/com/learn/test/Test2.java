package com.learn.test;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public boolean hasGroupsSizeX(int[] nums) {
        int[] result = new int[10000];
        for (int index : nums) {
            result[index]++;
        }
        return Arrays.stream(result).reduce(this::gcd).getAsInt() > 1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(a, a % b);
    }
}

