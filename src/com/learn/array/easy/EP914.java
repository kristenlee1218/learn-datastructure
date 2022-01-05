package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :给定一副牌，每张牌上都写着一个整数。此时需要选定一个
 * 数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：每组都有 X 张
 * 牌。组内所有的牌上都写着相同的整数。仅当可选的 X >= 2 时返回 true
 */
public class EP914 {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] counter = new int[10000];
        for (int num : deck) {
            counter[num]++;
        }
        int x = 0;
        for (int cnt : counter) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
