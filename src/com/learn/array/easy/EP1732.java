package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :有一个自行车手打算进行一场公路骑行，这条路线总共由
 * n + 1 个不同海拔的点组成。自行车手从海拔为 0 的点 0 开始骑行。
 * 一个长度为 n 的整数数组 gain，其中 gain[i] 是点 i 和点 i + 1 的
 * 净海拔高度差（0 <= i < n）。请返回最高点的海拔
 */
public class EP1732 {
    public int largestAltitude(int[] gain) {
        int altitude = 0, min = 0;
        for (int i : gain) {
            altitude += i;
            min = Math.max(altitude, min);
        }
        return min;
    }
}
