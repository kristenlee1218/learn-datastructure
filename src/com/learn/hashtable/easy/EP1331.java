package com.learn.hashtable.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 一个整数数组 arr，请将数组中的每个元素替换为它们
 * 排序后的序号。序号代表了一个元素有多大。序号编号的规则如下：序号从
 * 1 开始编号。一个元素越大，那么序号越大。如果两个元素相等，那么它们
 * 的序号相同。每个数字的序号都应该尽可能地小
 */
public class EP1331 {
    public int[] arrayRankTransform(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int value : temp) {
            if (map.get(value) == null) {
                map.put(value, count);
                count++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}
