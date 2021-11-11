package com.learn.dynamic.easy;

/**
 * @author : Kristen
 * @date : 2021/10/26
 * @description :一个整数 n，对于 0 <= i <= n 中的每个 i，
 * 计算其二进制表示中 1 的个数，返回一个长度为 n + 1 的数组 nums
 * <p>
 * 解析：
 * i & (i - 1)可以去掉 i 最右边的一个 1（如果有）
 * 因此 i & (i - 1) 是比 i 小的
 * 而且 i & (i - 1) 的 1 的个数已经在前面算过了，
 * 所以 i 的 1 的个数就是 i & (i - 1) 的 1 的个数 +1
 */
public class EP338 {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }
}
