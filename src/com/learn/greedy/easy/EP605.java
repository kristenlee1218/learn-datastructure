package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/7/25
 * @description :假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花
 * 不能种植在相邻的地块上，它们会争夺水源，两者都会死去。给你一个整数数组 flowerbed
 * 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n，
 * 能否在不打破种植规则的情况下种入 n 朵花？能则返回 true，不能则返回 false
 */
public class EP605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)
                    && (i == 0 || flowerbed[i - 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }
}
