package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/18
 * @description :一个含 n 个整数的数组 nums，其中 nums[i] 在区间 [1, n] 内。
 * 请找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果
 */
public class EP448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
