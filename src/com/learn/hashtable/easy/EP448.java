package com.learn.hashtable.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/18
 * @description :一个含 n 个整数的数组 nums，其中 nums[i] 在
 * 区间 [1, n] 内。请找出所有在 [1, n] 范围内但没有出现在 nums 中
 * 的数字，并以数组的形式返回结果
 */
public class EP448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            int x = (num - 1) % nums.length;
            nums[x] += nums.length;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= nums.length) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
