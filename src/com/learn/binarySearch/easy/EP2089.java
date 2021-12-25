package com.learn.binarySearch.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/12/25
 * @description :一个下标从 0 开始的整数数组 nums 以及一个目标元素
 * target。目标下标是一个满足 nums[i] == target 的下标 i。
 * 将 nums 按非递减顺序排序后，返回由 nums 中目标下标组成的列表。
 * 如果不存在目标下标，返回一个空列表。返回的列表必须按递增顺序排列
 */
public class EP2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
