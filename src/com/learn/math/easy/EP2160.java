package com.learn.math.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/3/13
 * @description : 一个四位正整数 num。请使用 num 中的数位，将 num 拆成两个新的整
 * 数 new1 和 new2。new1 和 new2 中可以有前导 0，且 num 中所有数位都必须使用
 */
public class EP2160 {
    public int minimumSum(int num) {
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(a);
        int n = a[0] * 10 + a[2];
        int m = a[1] * 10 + a[3];
        return m + n;
    }
}
