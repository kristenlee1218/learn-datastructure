package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :两个整数 n 和 start、数组 nums 定义为：且
 * n == nums.length、nums[i] = start + 2*i（下标从 0 开始）
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果
 */
public class EP1486 {
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result = result ^ (start + 2 * i);
        }
        return result;
    }
}
