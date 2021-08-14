package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :两个整数数组 nums 和 index。需要按照以下规则创建目标数组：
 * 目标数组 target 最初为空按从左到右的顺序依次读取 nums[i] 和 index[i]，
 * 在 target 数组中的下标 index[i] 处插入值 nums[i]、重复上一步，直到在 nums
 * 和 index 中都没有要读取的元素、请返回目标数组
 */
public class EP1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(index[i], nums[i]);
        }
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = result.get(i);
        }
        return target;
    }
}
