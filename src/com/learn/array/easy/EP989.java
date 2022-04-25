package com.learn.array.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序
 * 形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。给定非负整数
 * X 的数组形式 A，返回整数 X+K 的数组形式
 */
public class EP989 {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int i = nums.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += nums[i--];
            }
            list.addFirst(k % 10);
            k /= 10;
        }
        return list;
    }
}
