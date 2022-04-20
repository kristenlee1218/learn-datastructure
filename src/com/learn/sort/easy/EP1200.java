package com.learn.sort.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :整数数组 arr 其中每个元素都不相同。请找到所有具有最小
 * 绝对差的元素对，并且按升序的顺序返回
 */
public class EP1200 {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int absolute = Integer.MAX_VALUE, num;
        for (int i = 0; i < nums.length - 1; i++) {
            num = Math.abs(nums[i + 1] - nums[i]);
            if (num < absolute) {
                list.clear();
                list.add(Arrays.asList(nums[i], nums[i + 1]));
                absolute = Math.abs(nums[i + 1] - nums[i]);
            } else if (num == absolute) {
                list.add(Arrays.asList(nums[i], nums[i + 1]));
            }
        }
        return list;
    }
}
