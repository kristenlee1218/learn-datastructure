package com.learn.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Kristen
 * @date ：2022/3/31
 * @description :给定一个二进制数组 nums (索引从0开始)。将 xi 定义
 * 为其二进制表示形式为子数组 nums[0..i] (从最高有效位到最低有效位)。
 * 例如，如果 nums =[1,0,1] ，那么 x0 = 1, x1 = 2, 和 x2 = 5。返
 * 回布尔值列表 answer，只有当 xi 可以被 5 整除时，答案 answer[i] 为 true，否则为 false
 */
public class EP1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int prefix = 0;
        for (int num : nums) {
            prefix = ((prefix << 1) + num) % 5;
            list.add(prefix == 0);
        }
        return list;
    }
}
