package com.learn.dynamic.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/10/26
 * @description : 一个整数 n。按下述规则生成一个长度为 n + 1 的数组 nums：
 * nums[0] = 0
 * nums[1] = 1
 * 当 2 <= 2 * i <= n 时，nums[2 * i] = nums[i]
 * 当 2 <= 2 * i + 1 <= n 时，nums[2 * i + 1] = nums[i] + nums[i + 1]
 * 返回生成数组 nums 中的最大值
 */
public class EP1646 {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i / 2] + i % 2 * nums[i / 2 + 1];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
