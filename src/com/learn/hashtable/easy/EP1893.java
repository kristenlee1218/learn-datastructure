package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description :一个二维整数数组 ranges 和两个整数 left 和 right。
 * 每个 ranges[i] = [starti, endi] 表示一个从 starti 到 endi 的闭
 * 区间。如果闭区间 [left, right] 内每个整数都被ranges 中至少一个区间
 * 覆盖，那么请返回 true，否则返回 false。已知区间 ranges[i] =
 * [starti, endi]，如果整数 x 满足 starti <= x <= endi，那么称
 * 整数 x 被覆盖了
 */
public class EP1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] flag = new boolean[51];
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                flag[i] = true;
            }
        }
        for (int i = left; i <= right; i++) {
            if (!flag[i]) {
                return false;
            }
        }
        return true;
    }
}
