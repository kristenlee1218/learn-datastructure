package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 一个数组，其中的值符合等差数列的数值规律，在 0 <= i <
 * nums.length - 1 的前提下，nums[i+1] - nums[i] 的值都相等。从该数组中
 * 删除一个既不是第一个也不是最后一个的值，得到一个新的数组 nums。给这个缺值
 * 的数组 nums，请找出被删除的那个数
 */
public class EP1228 {
    public int missingNumber(int[] nums) {
        int min = 100005, max = -1, result = 0;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            result ^= num;
        }
        if (min == max) {
            return min;
        }
        int d = (max - min) / nums.length;
        for (int i = min; i <= max; i += d) {
            result ^= i;
        }
        return result;
    }
}
