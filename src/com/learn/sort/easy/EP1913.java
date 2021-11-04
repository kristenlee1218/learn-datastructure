package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/21
 * @description :两个数对 (a, b) 和 (c, d) 之间的 乘积差 定义为 (a * b) - (c * d)
 * 给你一个整数数组 nums ，选出四个 不同的 下标 w、x、y 和 z，
 * 使数对 (nums[w], nums[x]) 和 (nums[y], nums[z]) 之间的 乘积差 取到 最大值
 * 返回以这种方式取得的乘积差中的 最大值 。
 */

public class EP1913 {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
