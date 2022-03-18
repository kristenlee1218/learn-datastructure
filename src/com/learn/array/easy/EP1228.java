package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 有一个数组，其中的值符合等差数列的数值规律，也就是说：
 * 在 0 <= i < arr.length - 1 的前提下，arr[i+1] - arr[i] 的值都
 * 相等。我们会从该数组中删除一个既不是第一个也不是最后一个的值，得到一
 * 个新的数组 arr。给你这个缺值的数组 arr，请帮忙找出被删除的那个数
 */
public class EP1228 {
    public int missingNumber(int[] nums) {
        int min = 100005, max = -1, result = 0;
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
            result ^= x;
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
