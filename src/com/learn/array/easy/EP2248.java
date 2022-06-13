package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/4/27
 * @description : 一个二维整数数组 nums，其中 nums[i] 是由不同正整数组成的一个
 * 非空数组，按 升序排列返回一个数组，数组中的每个元素在 nums 所有数组中都出现过
 */
public class EP2248 {
    public List<Integer> intersection(int[][] nums) {
        int[] result = new int[1001];
        for (int[] num : nums) {
            for (int i : num) {
                result[i]++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= result.length - 1; i++) {
            if (result[i] == nums.length) {
                list.add(i);
            }
        }
        return list;
    }
}
