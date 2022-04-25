package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/3/24
 * @description : 一个下标从 0 开始的整数数组 nums。如果两侧距 i 最近的不相等邻
 * 居的值均小于 nums[i]，则下标 i 是 nums 中，某个峰的一部分。类似地，如果两侧
 * 距 i 最近的不相等邻居的值均大于 nums[i]，则下标 i 是 nums 中某个谷的一部分。
 * 对于相邻下标 i 和 j，如果 nums[i] == nums[j]，则认为这两下标属于同一个峰
 * 或谷。返回 nums 中峰和谷的数量
 */
public class EP2210 {
    public int countHillValley(int[] nums) {
        int flag = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (flag == 1) {
                    count++;
                }
                flag = 2;
            }
            if (nums[i] < nums[i + 1]) {
                if (flag == 2) {
                    count++;
                }
                flag = 1;
            }
        }
        return count;
    }
}
