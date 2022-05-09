package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 给定一副牌，每张牌上都写着一个整数。此时需要选定一
 * 个数字 X，可以将整副牌按下述规则分成 1 组或更多组：每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。仅当可选的 X >= 2 时返回 true
 */
public class EP914 {
    public boolean hasGroupsSizeX(int[] nums) {
        int[] result = new int[10000];
        for (int index : nums) {
            result[index]++;
        }
        return Arrays.stream(result).reduce(this::gcd).getAsInt() > 1;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
