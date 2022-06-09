package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/19
 * @description : 给定一个无重复元素的有序整数数组 nums、返回恰好覆盖数组
 * 中所有数字的最小有序区间范围列表。nums 的每个元素都恰好被某个区间范围所
 * 覆盖，并且不存在属于某个范围但不属于 nums 的数字 x
 */
public class EP228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (!(i + 1 < nums.length && nums[i] == nums[i + 1] - 1)) {
                if (sb.length() > 0) {
                    sb.append("->");
                }
                sb.append(nums[i]);
                list.add(sb.toString());
            } else {
                if (sb.length() == 0) {
                    sb.append(nums[i]);
                }
            }
        }
        return list;
    }
}
