package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2022/6/9
 * @description : 一个下标从 0 开始的整数数组 nums，其长度是 2 的幂
 * 对 nums 执行下述算法：
 * 设 n 等于 nums 的长度，如果 n == 1，终止算法过程。否则，创建一个
 * 新的整数数组 newNums，新数组长度为 n / 2，下标从 0 开始。
 * 对于满足 0 <= i < n / 2 的每个偶数下标 i，将 newNums[i] 赋值为
 * min(nums[2 * i], nums[2 * i + 1])
 * 对于满足 0 <= i < n / 2 的每个奇数下标 i，将 newNums[i] 赋值为
 * max(nums[2 * i], nums[2 * i + 1])
 * 用 newNums 替换 nums
 * 从步骤 1 开始 重复 整个过程
 * 执行算法后，返回 nums 中剩下的那个数字
 */
public class EP2293 {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n != 1) {
            int count = 0;
            for (int i = 0; i < n; ) {
                if (count % 2 == 0) {
                    nums[count] = Math.min(nums[i], nums[i + 1]);
                } else {
                    nums[count] = Math.max(nums[i], nums[i + 1]);
                }
                i += 2;
                count++;
            }
            n = count;
        }
        return nums[0];
    }
}
