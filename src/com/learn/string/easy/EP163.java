package com.learn.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 给定一个排序的整数数组 nums，其中元素的范围在闭
 * 区间 [lower, upper] 当中，返回不包含在数组中的缺失区间
 */
public class EP163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        long l = lower, u = upper;
        for (int num : nums) {
            if (num - l == 1) {
                list.add(String.valueOf(l));
            } else if (num - l > 1) {
                list.add(l + "->" + (num - 1));
            }
            l = (long) num + 1;
        }
        if (l == u) {
            list.add(String.valueOf(l));
        } else if (l < u) {
            list.add(l + "->" + u);
        }
        return list;
    }
}
